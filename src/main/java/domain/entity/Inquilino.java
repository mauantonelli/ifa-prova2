package domain.entity;

public class Inquilino extends Pessoa {
    private String cpf;

    public Inquilino(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
