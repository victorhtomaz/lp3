package Lista04.Exe1;

public class Quadrado extends Retangulo{
    public Quadrado(double lado){
        super(lado, 0);
    }

    public double cacularArea() {
        return lado1 * lado1;
    }

    public double calcularPerimetro() {
        return 4 * lado1;
    }

    @Override
    public String toString() {
        return "Lado: " + lado1;
    }
}
