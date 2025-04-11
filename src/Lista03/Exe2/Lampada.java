package Lista03.Exe2;

public class Lampada {
    double voltagem;
    double comprimento;
    boolean ligado;

    Lampada(double voltagem, double comprimento){
        this.voltagem = voltagem;
        this.comprimento = comprimento;
        this.ligado = false;
    }

    public void mudarEstado(){
        ligado = !ligado;
    }
}
