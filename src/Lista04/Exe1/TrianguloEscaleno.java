package Lista04.Exe1;

public class TrianguloEscaleno extends Triangulo{
    public TrianguloEscaleno(double lado1, double lado2, double lado3){
        super(lado1, lado2, lado3);
    }

    @Override
    public String toString() {
        return "Primeiro lado: " + lado1 + ", Segundo lado: " + lado2 + ", Terceiro lado: " + lado3;
    }
}
