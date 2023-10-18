package claseAbstracta;

public class Main {

    public static void main(String[] args) {
        TrianguloBase trianguloEscaleno = new Escaleno(3, 4, 5);

        double areaConHipotenusaEscaleno = trianguloEscaleno.calcularAreaConHipotenusa();
        double perimetroEscaleno = trianguloEscaleno.calcularPerimetro();

        System.out.println("Área con hipotenusa del triángulo escaleno: " + areaConHipotenusaEscaleno);
        System.out.println("Perímetro del triángulo escaleno: " + perimetroEscaleno);

        TrianguloBase trianguloAcutángulo = new Acutángulo(3, 4, 5);

        double areaConHipotenusaAcutángulo = trianguloAcutángulo.calcularAreaConHipotenusa();
        double perimetroAcutángulo = trianguloAcutángulo.calcularPerimetro();

        System.out.println("Área con hipotenusa del triángulo acutángulo: " + areaConHipotenusaAcutángulo);
        System.out.println("Perímetro del triángulo acutángulo: " + perimetroAcutángulo);
    }
}
