public class Assinatura {
    private final FabricaPais fabrica;

    public Assinatura(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public void ativar(String cliente) {
        ComprovanteFiscal comprovante = fabrica.criarComprovante();
        Pagamento pagamento = fabrica.criarPagamento();
        TermoPrivacidade termo = fabrica.criarTermo();
        System.out.println("Assinatura ativada para: " + cliente);
        System.out.println("Comprovante: " + comprovante.descricao());
        System.out.println("Pagamento: " + pagamento.descricao());
        System.out.println("Termo: " + termo.descricao());
        System.out.println("--");
    }
}
