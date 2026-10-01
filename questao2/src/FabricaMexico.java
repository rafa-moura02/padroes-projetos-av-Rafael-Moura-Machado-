public class FabricaMexico implements FabricaPais {
    public ComprovanteFiscal criarComprovante() 
    { return new CfdiMexico(); }
    public Pagamento criarPagamento() 
    { return new PagamentoSpei(); }
    public TermoPrivacidade criarTermo() 
    { return new TermoLfpdppp(); }
}
