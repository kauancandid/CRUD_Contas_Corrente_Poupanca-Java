package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaContas {

    private CRUDContas crudContas;

    CRUDContas crud = new CRUDContas();

    private int menu() {
        int resposta = 0;
        System.out.println("Menu - Gerenciador de Contas");

        System.out.println("1. Transferir valor entre contas");
        System.out.println("2. Adicionar Conta");
        System.out.println("3. Imprimir contas");
        System.out.println("4. Sair...");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção que vc quer realizar: ");
        resposta = input.nextInt();
        return resposta;

    }

    private void adicionarConta() {

        Endereco endereco = new Endereco("Cajazeiras", "Avenida Brasil", "Centro", 267);
        Cliente cliente = new Cliente("Robson", "123321", "aaa@gmail.com", 40028922, endereco, 60);

        Endereco endereco2 = new Endereco("Sousa", "Avenida Brasil", "Zona Sul", 467);
        Cliente cliente2 = new Cliente("Maria", "45345", "bbb@gmail.com", 434522, endereco2, 80);

        Conta poupanca = new ContaPoupanca(cliente, 4321, 123);
        Conta corrente = new ContaCorrente(cliente2, 1234, 123);

        crud.adicionar(corrente);
        crud.adicionar(poupanca);

        System.out.println("\n");

    }

    private void transferirValorEntreContas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua sua conta: ");
        int usu = input.nextInt();

        System.out.println("Digite o valor que você quer transferir: ");
        double valor = input.nextDouble();

        System.out.println("Digite a conta para a realizar a transferência: ");
        int conta = input.nextInt();

        System.out.println("Digite a agência da conta, para realizar a transferência: ");
        int agencia = input.nextInt();

        for (Conta c : crud.getContas()) {
            if (c.numeroConta == usu) {
                c.transferir(valor, conta, agencia);
                for (Conta e : crud.getContas()) {
                    if (e.numeroConta == conta) {
                        e.saldo = e.saldo + valor;
                    }
                }

            }
        }
    }

    private void imprimirContas() {
        for (Conta c : crud.getContas()) {

            System.out.println(c);
            System.out.println("------------------");
        }

    }

    public void executarAplicacao() {

        int opc = menu();

        while (opc != 5) {

            switch (opc) {
                case 1:
                    transferirValorEntreContas();
                    opc = menu();
                    break;
                case 2:
                    adicionarConta();
                    opc = menu();
                    break;
                case 3:
                    imprimirContas();
                    opc = menu();
                default:
                    break;
            }
        }
        System.out.println("Você saiu do Programa...");
    }

}
