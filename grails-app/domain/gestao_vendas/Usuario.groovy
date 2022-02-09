package gestao_vendas
class Usuario{
    String usuario
    String senha
    static constraints = {
        senha(nullable: false, blank: false, password: true, sizeMax: 50)
        usuario(nullable: false, blank: false, unique: true, sizeMax: 50)
    }
    @Override
    public String toString(){
        return usuario;
    }
    static mapping = {
	    password column: '`senha`'
    }
}