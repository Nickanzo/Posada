public class Hospede {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Hospede acompanhante;

    public Hospede(HospedeBuilder builder) {
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.acompanhante = builder.acompanhante;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Hospede getAcompanhante() {
        return acompanhante;
    }
}
