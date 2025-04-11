package Lista03.Exe1;

public class Retangulo extends Poligono{
    private double base;
    private double altura;

    @Override
    double cacularArea() {
        return base * altura;
    }
    @Override
    double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }
}
