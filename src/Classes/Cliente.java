package Classes;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private int celular;
    private Endereco endereco;
    private double dinheiro;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String email, int celular, Endereco endereco, double dinheiro) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.endereco = endereco;
        this.dinheiro = dinheiro;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", celular=" + celular + ", endereco=" + endereco + ", dinheiro=" + dinheiro + '}';
    }

}
