public class Quarto implements Prototype{

    private int numero;
    private double precoDiaria;
    private boolean ocupado;
    private int numeroCamas;
    public Quarto() {
    }
    private Quarto(Quarto quarto) {
        this.numero = quarto.getNumero();
        this.precoDiaria = quarto.getPrecoDiaria();
        this.ocupado = quarto.isOcupado();
        this.numeroCamas = quarto.getNumeroCamas();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    @Override
    public Quarto clone() {
        return new Quarto(this);
    }
}
