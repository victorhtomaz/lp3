package Lista03.Exe1;

public class Circulo extends Poligono{
    private final double pi = 3.14;
    private double raio;

    @Override
    double cacularArea() {
        return pi * Math.pow(raio, 2);
    }

    @Override
    double calcularPerimetro() {
        return 2 * pi * raio;
    }
}
