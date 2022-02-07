package gestao_vendas
class VendaItem{
    Produto produto
    BigDecimal valorUnitario
    BigDecimal quantidade
    BigDecimal desconto
    BigDecimal valorTotalItem
    static constraints = {
        produto(nullable:false)
        valorUnitario(nullable:false)
        quantidade(nullable:false)
        desconto(nullable:true)
        valorTotalItem(nullable:false)
    }
    static mapping = {
        id generator: 'sequence', params: [sequence: 'sequence_venda_item']
    }
}