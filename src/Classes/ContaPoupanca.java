package Classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int numeroConta, int agencia) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nome = cliente.getNome();

        double dinheiro = cliente.getDinheiro();

        if (dinheiro < 50) {
            throw new IllegalArgumentException("Você não pode criar a conta, sem ter no minimo 50 reais!");
        } else {
            saldo = saldo + 50;
            System.out.println("Conta Poupança Criada");

        }

    }

    public void rendimento(int dia, Month mes, int ano) {
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.of(ano, mes, dia, 23, 59);
        Duration duracao = Duration.between(time, time2);
        long days = duracao.toDays();

        if (days != 30) {
            throw new IllegalArgumentException("Não pode ter rendimento antes de passar um mês!");

        } else {
            double rendimento = (saldo * 0.013);
            saldo = saldo + rendimento;
            System.out.println("Seu rendimento foi de: " + rendimento);
            System.out.println("Seu novo saldo é: " + saldo);
        }

    }

    @Override
    public void depositar(double valor) {

        if (valor < 0) {
            throw new IllegalArgumentException("Você não pode depositar um valor negativo!");

        } else {
            saldo = saldo + valor;
            System.out.println("Depositado com sucesso o valor: " + valor);

        }

    }

    @Override
    public void transferir(double valor, int conta, int agencia) {

        if (agencia != this.agencia) {

            throw new IllegalArgumentException("Você não pode transferir para uma conta de banco diferente!");

        } else {

            if (saldo < valor) {

                throw new IllegalArgumentException("Seu saldo é insuficiente para a transferencia!");

            } else {

                saldo = saldo - valor;
                System.out.println("Transferência do valor: " + valor + " efetuado com sucesso para a conta: " + conta);

            }
        }

    }

    @Override
    public void sacar(double valor) {

        if (valor > saldo) {

            throw new IllegalArgumentException("Seu saldo é insuficiente para sacar!");

        } else {
            System.out.println("Dinheiro sacado com sucesso. Dinheiro sacado foi: " + valor);
            saldo = saldo - valor;
        }
    }

    @Override
    public String toString() {
        return "Conta Poupanca \n"
                + "saldo: " + saldo + "\n"
                + "agencia: " + agencia + "\n"
                + "numeroConta: " + numeroConta + "\n"
                + "nome: " + nome + "\n";
    }

}
