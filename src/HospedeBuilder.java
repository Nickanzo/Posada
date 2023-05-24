public class HospedeBuilder {

        public String nome;
        public String cpf;
        public String email;
        public String telefone;
        public Hospede acompanhante;

        public HospedeBuilder addNome(String nome){
            this.nome = nome;
            return this;
        }

        public HospedeBuilder addCpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public HospedeBuilder addEmail(String email) {
            this.email = email;
            return this;
        }

        public HospedeBuilder addTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public HospedeBuilder addAcompanhante(Hospede acompanhante) {
            this.acompanhante = acompanhante;
            return this;
        }

        public Hospede build() {
            return new Hospede(this);
        }
}
