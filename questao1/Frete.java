public interface Frete {
    
    String modalidade();
    double calcularValor(double valorCarga);
    String documentos();

}
