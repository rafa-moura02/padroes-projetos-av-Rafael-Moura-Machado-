public class FreteAereo implements Frete {

    public String modalidade() 
    {return  "Aereo";}

    public double calcularValor(double valorCarga) 
    {return valorCarga * 0.06;}

    public String documentos() 
    {return "AWB (Air Waybill)";}

}
