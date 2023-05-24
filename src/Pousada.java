import java.util.ArrayList;
import java.util.Date;

public class Pousada {

    private static Pousada instance;
    private ArrayList<ReservaQuarto> reservas;
    private ArrayList<Quarto> quartos;
    private Integer numeroReserva = 1;

    private Pousada() {
        reservas = new ArrayList<>();
        quartos = new ArrayList<>();
    }
    public static Pousada getInstance() {
        if (instance == null){
            instance = new Pousada();
        }
        return instance;
    }

    public void criaReserva(Hospede hospede, Date checkin, Date checkout){
        ReservaQuarto rq = procuraReserva(hospede.getCpf());
        //Verifica se ja existe uma reserva com o CPF do Hospede
        if (rq!=null){
            System.err.println("O hospede ja possui uma reserva!");
            return;
        }
        Quarto q = hospede.getAcompanhante() == null ?
                buscaQuartosDisponiveis(Quarto.Tipo.Solteiro) :
                buscaQuartosDisponiveis(Quarto.Tipo.Casal);
        if (q==null){
            System.err.println("Nao tem quartos disponiveis !");
            return;
        }
        try{
            rq = new ReservaQuartoBuilder().
                    addHospede(hospede).
                    addQuarto(q).
                    addNumeroReserva(numeroReserva++).
                    addDataCheckin(checkin).
                    addDataCheckout(checkout).
                    build();
            reservas.add(rq);
            System.out.println("Reserva adicionada com sucesso !");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ReservaQuarto procuraReserva(String cpf){
        for (ReservaQuarto rq: reservas){
            if (rq.getHospede().getCpf().equals(cpf)){
                return rq;
            }
        }
        return null;
    }

    public void cancelaReserva(ReservaQuarto reservaQuarto){
        reservas.remove(reservaQuarto);
    }

    public void limpaReservas(){
        for (ReservaQuarto r : reservas){
            if (r.getDataCheckout().before(new Date())){
                r.getQuarto().setOcupado(false);
                r.setHospede(null);
            }
        }
    }

    public Quarto buscaQuartosDisponiveis(Quarto.Tipo tipo){
        for (Quarto q : quartos){
            if (!q.isOcupado() && q.getTipo()==tipo){
                return q;
            }
        }
        return null;
    }

}
