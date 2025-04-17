package Lista04.Exe1;

public class Retangulo extends ObjetoGeometrico{
    protected double lado1;
    protected double lado2;

    Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double cacularArea() {
        return lado1 * lado2;
    }

    public double calcularPerimetro() {
        return (lado1*2) + (lado2*2);
    }

    @Override
    public String toString() {
        return "Base: " + lado1 + ", Altura: "+ lado2;
    }
}
