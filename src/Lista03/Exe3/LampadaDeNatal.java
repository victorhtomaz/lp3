package Lista03.Exe3;

public class LampadaDeNatal implements Lampada2, Cor {
    String cor;
    double voltagem = 110;
    double comprimento = 0;
    boolean ligado = false;
    @Override
    public void mudarEstado() {
        ligado = !ligado;
    }
    private void mudarCor(String cor){
     this.cor = cor;
    }
    public void mudarParaBranco(){
        mudarCor(corBranca);
    }
    public void mudarParaVermelhor(){
        mudarCor(corVermelha);
    }
    public void mudaParaAzul(){
        mudarCor(corAzul);
    }
    public void mudarParaVerde(){
        mudarCor(corVerde);
    }
}
