package claseAbstracta;

public class Escaleno extends TrianguloBase {

    public Escaleno(int ladoA, int ladoB, int hipotenusa) {
        super(ladoA, ladoB, hipotenusa);
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + hipotenusa;
    }
}