package Lista04.Exe2;
import Lista04.Exe1.*;

public class FormasGeometricas {
    public static void main(String[] args){

        Quadrado quadrado = new Quadrado(4);
        System.out.println(quadrado.toString());
        System.out.println(quadrado.cacularArea());
        System.out.println(quadrado.calcularPerimetro());

        Triangulo tri1 = new TrianguloEscaleno(3, 4, 5);
        Triangulo tri2 = new TrianguloIsosceles(4, 6);
        Triangulo tri3 = new TrianguloEquilatero(5);

        System.out.println(tri1.toString());
        System.out.println(tri1.cacularArea());
        System.out.println(tri1.calcularPerimetro());
        System.out.println(tri2.toString());
        System.out.println(tri2.cacularArea());
        System.out.println(tri2.calcularPerimetro());
        System.out.println(tri3.toString());
        System.out.println(tri3.cacularArea());
        System.out.println(tri3.calcularPerimetro());
    }
}