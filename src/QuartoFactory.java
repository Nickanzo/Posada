public abstract class QuartoFactory {

    protected Quarto quarto;

    public abstract void criaQuarto(Quarto.Tipo tipo);

    public Quarto buscaQuarto(){
        return quarto;
    }

}
