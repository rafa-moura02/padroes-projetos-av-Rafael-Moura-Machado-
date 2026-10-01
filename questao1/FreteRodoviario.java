public class FreteRodoviario implements Frete {

    public String modalidade() 
    {return "Rodoviario";}

    public double calcularValor(double valorCarga) 
    {return valorCarga * 0.02;}
    
    public String documentos() 
    {return "CT-e, MDF-e";}

    
}
