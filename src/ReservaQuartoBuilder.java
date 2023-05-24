import java.util.Date;

public class ReservaQuartoBuilder {
    private ReservaQuarto reservaQuarto;
    public ReservaQuartoBuilder(){
        reservaQuarto = new ReservaQuarto();
    }

    public ReservaQuartoBuilder addNumeroReserva(int numeroReserva){
        this.reservaQuarto.setNumeroReserva(numeroReserva);
        return this;
    }

    public ReservaQuartoBuilder addDataCheckin(Date dataCheckin){
        this.reservaQuarto.setDataCheckin(dataCheckin);
        return this;
    }

    public ReservaQuartoBuilder addDataCheckout(Date dataCheckout){
        this.reservaQuarto.setDataCheckout((dataCheckout));
        return this;
    }

    public ReservaQuartoBuilder addQuarto(Quarto quarto){
        this.reservaQuarto.setQuarto(quarto);
        quarto.setOcupado(true);
        return this;
    }

    public ReservaQuartoBuilder addHospede(Hospede hospede){
        this.reservaQuarto.setHospede(hospede);
        return this;
    }

    public ReservaQuarto build() throws Exception{
        if (this.reservaQuarto.getHospede()==null){
            throw new Exception("Necessario ter um hospede para criacao de reserva!");
        }
        if (this.reservaQuarto.getQuarto()==null){
            throw new Exception("Necessario ter um quarto para criacao de reserva!");
        }
        if (this.reservaQuarto.getDataCheckin().after(this.reservaQuarto.getDataCheckout())){
            throw new Exception("A data de saida nao pode ser anterior a data de entrada");
        }
        return this.reservaQuarto;
    }

}
