package Lista04.Exe1;

public class Triangulo extends ObjetoGeometrico{
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double altura;
    Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double cacularArea(){
        return 0;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
