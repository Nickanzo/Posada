import java.util.Date;

public class ReservaQuarto {

    private int numeroReserva;
    private Date dataCheckin;
    private Date dataCheckout;
    private Quarto quarto;
    private Hospede hospede;

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        if (hospede.getAcompanhante() != null){
            return "********************************" + "\n" +
                    "Reserva numero " + numeroReserva + "\n" +
                    "Hospedes: " + hospede.getNome() + " | " +
                    hospede.getAcompanhante().getNome() + "\n" +
                    "Quarto: " + quarto.getNumero() + "\n" +
                    "Data de entrada: " + dataCheckin + "\n" +
                    "Data de saida " + dataCheckout + "\n";
        }
        return  "*******************************" + "\n" +
                "Reserva numero " + numeroReserva + "\n" +
                "Hospede: " + hospede.getNome() + "\n" +
                "Quarto: " + quarto.getNumero() + "\n" +
                "Data de entrada: " + dataCheckin + "\n" +
                "Data de saida " + dataCheckout + "\n";
    }
}