package Lista03.Exe1;

public class Quadrado extends PoligonoRegular{
    Quadrado(double lado){
        this.lado = lado;
    }
    private double lado;

    @Override
    double cacularArea() {
        return lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }
}
