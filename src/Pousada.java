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
        populaQuartos();
    }
    private void populaQuartos(){
        Quarto quartoPadrao = new Quarto();
        quartoPadrao.setPrecoDiaria(120.00);
        quartoPadrao.setOcupado(false);
        quartoPadrao.setNumeroCamas(2);

        for (int i = 1; i < 16; i++){
            Quarto q = quartoPadrao.clone();
            q.setNumero(i);
            quartos.add(q);
        }
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
        Quarto q = buscaQuartosDisponiveis();
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
        reservaQuarto.getQuarto().setOcupado(false);
        reservas.remove(reservaQuarto);
    }

    public void limpaReservas(){
        for (ReservaQuarto r : reservas){
            if (r.getDataCheckout().before(new Date())){
                r.getQuarto().setOcupado(false);
                reservas.remove(r);
            }
        }
    }

    public void listaReservas(){
        for (ReservaQuarto r : reservas){
            System.out.println(r.toString());
        }
    }

    public Quarto buscaQuartosDisponiveis(){
        for (Quarto q : quartos){
            if (!q.isOcupado()){
                return q;
            }
        }
        return null;
    }

    public void statusQuartos(){
        for (Quarto q : quartos){
            if (q.isOcupado()){
                System.err.println("Quarto " + q.getNumero() + " ocupado");
            }else{
                System.out.println("Quarto " + q.getNumero() + " disponível");
            }
        }
    }


}
