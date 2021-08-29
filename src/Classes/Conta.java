package Classes;

public abstract class Conta {

    double saldo;
    int agencia;
    int numeroConta;
    String nome;

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, int conta, int agencia);

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
