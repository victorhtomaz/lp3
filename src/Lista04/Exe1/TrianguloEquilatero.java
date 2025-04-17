package Lista04.Exe1;

public class TrianguloEquilatero extends Triangulo{
    public TrianguloEquilatero(double lado){
        super(lado, lado, lado);
    }

    public double cacularArea() {
        return (lado1 * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "3 Lados com: " + lado1;
    }
}
