package Lista03.Exe3;

public class LampadaIncandescente implements Lampada2 {
    double voltagem = 110;
    double comprimento = 0;
    boolean ligado = false;
    @Override
    public void mudarEstado() {
        ligado = !ligado;
    }
}
