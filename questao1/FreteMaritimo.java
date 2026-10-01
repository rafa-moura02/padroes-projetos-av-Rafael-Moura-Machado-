public class FreteMaritimo implements Frete {

    public String modalidade() 
    {return "Maritimo"; }

    public double calcularValor(double valorCarga)
    { return valorCarga * 0.01;}

    public String documentos()
    {return "BL (Bill of Loading), Fstura comercial";}

}
