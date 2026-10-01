public class ContratacaoMaritima extends Contratacao {
    protected Frete criarFrete() 
    {return new FreteMaritimo();}
}
