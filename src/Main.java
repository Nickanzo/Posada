import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    static ArrayList<Hospede> listaHospedes = new ArrayList<>();
    public static void main(String[] args) {

        Pousada pousada = Pousada.getInstance();

        criaHospedes();

        Random r = new Random();

        for (Hospede h : listaHospedes){
            pousada.criaReserva(h,new Date(2023,04,r.nextInt(30)),new Date(2023,05,r.nextInt(25)));
        }

        pousada.statusQuartos();

        pousada.listaReservas();

    }

    public static void criaHospedes(){

        Hospede hospede1 = new HospedeBuilder().addNome("João Silva")
                .addCpf( "12345678901")
                .addEmail("joao.silva@example.com")
                .addTelefone("(11) 98765-4321")
                .build();

        Hospede hospede2 = new HospedeBuilder().addNome("Maria Santos")
                .addCpf("98765432109")
                .addEmail("maria.santos@example.com")
                .addTelefone("(22) 99876-5432")
                .build();

        Hospede hospede3 = new HospedeBuilder().addNome("Pedro Oliveira")
                .addCpf("56789012345")
                .addEmail("pedro.oliveira@example.com")
                .addTelefone("(33) 91234-5678")
                .addAcompanhante(hospede2)
                .build();

        Hospede hospede4 = new HospedeBuilder()
                .addNome("Laura Mendes")
                .addCpf("65432109876")
                .addEmail("laura.mendes@example.com")
                .addTelefone("(44) 98765-4321")
                .build();

        Hospede hospede5 = new HospedeBuilder()
                .addNome("Carlos Ferreira")
                .addCpf("90876543210")
                .addEmail("carlos.ferreira@example.com")
                .addTelefone("(55) 99876-5432")
                .addAcompanhante(hospede1)
                .build();

        Hospede hospede6 = new HospedeBuilder()
                .addNome("Ana Costa")
                .addCpf("32109876543")
                .addEmail("ana.costa@example.com")
                .addTelefone("(66) 91234-5678")
                .build();

        Hospede hospede7 = new HospedeBuilder()
                .addNome("Paulo Santos")
                .addCpf("89012345678")
                .addEmail("paulo.santos@example.com")
                .addTelefone("(77) 92345-6789")
                .addAcompanhante(hospede6)
                .build();

        Hospede hospede8 = new HospedeBuilder()
                .addNome("Camila Almeida")
                .addCpf("45678901234")
                .addEmail("camila.almeida@example.com")
                .addTelefone("(88) 93456-7890")
                .build();

        listaHospedes.add(hospede3);
        listaHospedes.add(hospede4);
        listaHospedes.add(hospede5);
        listaHospedes.add(hospede7);
        listaHospedes.add(hospede8);

    }
}