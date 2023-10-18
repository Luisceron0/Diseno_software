package claseAbstracta;

public class Acutángulo extends TrianguloBase {

    public Acutángulo(int ladoA, int ladoB, int hipotenusa) {
        super(ladoA, ladoB, hipotenusa);
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + hipotenusa;
    }
}