public class ContratacaoRodoviaria extends Contratacao {
    protected Frete criarFrete()
    {return new FreteRodoviario();}
   
}
