public class ContratacaoAerea extends Contratacao {
    protected Frete criarFrete() 
    { return new FreteAereo(); }
}
