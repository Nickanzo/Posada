public class Hospede {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String email;
    private String telefone;
    private Hospede acompanhante;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Hospede getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Hospede acompanhante) {
        this.acompanhante = acompanhante;
    }
}
