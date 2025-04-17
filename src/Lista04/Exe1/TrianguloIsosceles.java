package Lista04.Exe1;

public class TrianguloIsosceles extends Triangulo{

    public TrianguloIsosceles(double lado, double base){
        super(lado, lado, base);
    }
    public double cacularArea() {
        return 232;
    }

    @Override
    public String toString() {
        return "Lados: " + lado1 + ", Base: " + lado3;
    }
}
