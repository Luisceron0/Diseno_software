package claseAbstracta;

public abstract class TrianguloBase {

    protected int ladoA;
    protected int ladoB;
    protected int hipotenusa;

    public TrianguloBase(int ladoA, int ladoB, int hipotenusa) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.hipotenusa = hipotenusa;
    }

    public abstract double calcularPerimetro();

    public double calcularAreaConHipotenusa() {
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - hipotenusa));
    }
}
