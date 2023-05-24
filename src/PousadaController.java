import java.util.ArrayList;

public class PousadaController {

    private static PousadaController instance;
    private ArrayList<ReservaQuarto> reservas;
    private ArrayList<Quarto> quartos;
    private Integer numeroReserva = 1;

    private PousadaController() {
        reservas = new ArrayList<>();

    }
    public static PousadaController getInstance() {
        if (instance == null){
            instance = new PousadaController();
        }
        return instance;
    }

//    public void criaReserva(Hospede hopede){
//        ArrayList<Quarto> quarto = buscaQuartosDisponiveis();
//        if (quarto.isEmpty()){
//
//        }else{
//            if (procuraReserva(reserva.getNumeroReserva())==null){
//                reserva.setNumeroReserva(numeroReserva);
//                reservas.add(reserva);
//                System.out.println("Reserva numero " + numeroReserva + " criada com sucesso!");
//                numeroReserva++;
//            }else{
//                System.out.println("Reser");
//            }
//        }
//
//    }

    public ReservaQuarto procuraReserva(int numeroReserva){
        for (ReservaQuarto rq: reservas){
            if (rq.getNumeroReserva() == numeroReserva){
                return rq;
            }
        }
        return null;
    }

    public ArrayList<Quarto> buscaQuartosDisponiveis(){
        ArrayList<Quarto> quartosDisp = new ArrayList<>();
        for (Quarto q : quartos){
            if (!q.isOcupado()){
                quartosDisp.add(q);
            }
        }
        return quartosDisp;
    }

}
