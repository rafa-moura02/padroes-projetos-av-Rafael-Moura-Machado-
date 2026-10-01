public abstract class Contratacao {
    protected abstract Frete criarFrete();

    public final void contratar(String cliente,double valorCarga) {
        Frete frete = criarFrete();

        double valor = frete.calcularValor(valorCarga);
            System.out.println("Modalidade:" + frete.modalidade());
            System.out.println("Cliente:" + cliente);
            System.out.printf("Valor do frete: R$ %.2f%n", valor);
            System.out.println("Documentos:" + frete.documentos());
            System.out.println("--");
    }
}
