public class QuartoFactorySolteiro extends QuartoFactory{
    @Override
    public void criaQuarto(Quarto.Tipo tipo) {
        quarto = new QuartoSolteiro();
    }
}
