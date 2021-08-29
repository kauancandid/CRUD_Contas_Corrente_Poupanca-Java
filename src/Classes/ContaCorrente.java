package Classes;

public class ContaCorrente extends Conta {

    public ContaCorrente() {

    }

    public ContaCorrente(Cliente cliente, int numeroConta, int agencia) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nome = cliente.getNome();

        double dinheiro = cliente.getDinheiro();

        if (dinheiro < 50) {
            throw new IllegalArgumentException("Você não pode criar a conta, sem ter no minimo 50 reais!");
        } else {
            saldo = saldo + 50;
            System.out.println("Conta Corrente Criada");

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

            double taxa = (valor * 0.005); //arredondar
            double descontar = taxa + valor;
            if (saldo < descontar) {

                throw new IllegalArgumentException("Seu saldo é insuficiente para a transferencia!");

            } else {

                saldo = saldo - descontar;
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
        return "Conta Corrente \n" + "saldo: " + saldo + "\n"
                + "agencia: " + agencia + "\n"
                + "numeroConta: " + numeroConta + "\n"
                + "nome: " + nome + "\n";
    }

}
