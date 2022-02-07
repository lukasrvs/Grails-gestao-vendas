package gestao_vendas
class Cliente{
    String nome
    String cpfCnpj
    String email
    static constraints = {
        nome(nullable:false, maxSize:255)
        email(email:true, nullable: false, unique: true)
        cpfCnpj(nullable: false)
    }
    static mapping = {
        id generator: 'sequence', params: [sequence: 'sequence_cliente']
    }
    @Override
    public String toString(){
        return nome;
    }
}