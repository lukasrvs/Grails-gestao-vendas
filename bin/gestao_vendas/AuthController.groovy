package gestao_vendas

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AuthController {

    AuthService authService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        verificarSession()
    }

    def login(){
        verificarSession()
    }

    def register(){
        if(session.user == false || session.user == null){ 
            render(view:"register")
        }else{
            redirect(uri: '/')
        }
    }

    def encerrar(){
        session.user = false
        redirect(view:'login')
    }
    // verifica se existe um usuário logado no sistema
    def verificarSession(){
        if(session.user == false || session.user == null){ 
            render(view:"login")
        }else{
            redirect(uri: '/')
        }
    }

    def acessar(){
        def usuario = params.usuario
        def senha = params.senha

        if (usuario != null) {
            Usuario usuarioInstance = Usuario.findByUsuario(usuario);
            if (usuarioInstance != null) {
                if (usuarioInstance.senha == senha) {
                    session.user = true
                    redirect(uri: '/')
                }
            }
        }
        render(view:"login")
    }

    def salvar(Usuario usuarioInstance){
        if (usuarioInstance == null) {
            notFound()
            return
        }
        try {
            usuarioInstance.save(flush: true)
            render(view:'login')
        } catch (ValidationException e) {
            respond usuarioInstance.errors, view:'create'
            return
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'auth.label', default: 'Auth'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
