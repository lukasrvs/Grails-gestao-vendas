package gestao_vendas
class Usuario{
    String nome
    String usuario
    String senha
    static constraints = {
        nome(nullable: false, maxSize:255)
        usuario(nullable:false, maxSize:50, unique: true)
        senha(nullable:false, maxSize:50)
    }
    static mapping = {
        id generator: 'sequence', params: [sequence: 'sequence_usuario']
    }
}