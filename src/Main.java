import java.util.Scanner;

public class Main {
    public static <dados> void main(String[] args) {

        Dados conta = new Dados();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        Double numconta = sc.nextDouble();

        sc.nextLine();


        System.out.println("Digite o Nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Digite o valor a depositar: ");
        Double valor = sc.nextDouble();

        int Entrada;
        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            Entrada = sc.nextInt();

            System.out.println("Digite 1 para depositar e 2 para sacar: ");
            int opcao = sc.nextInt();


            if (opcao == 1) {

                System.out.println("Digite o valor a depositar: ");
                Double valordepositar = sc.nextDouble();
                conta.depositar(valordepositar);
                Double SaldoAtual = valor + valordepositar;
                System.out.println("Conta depositado com sucesso! Saldo atual: " + SaldoAtual);

            } else if (opcao == 2) {
                System.out.println("Digite o valor a Sacar: ");
                Double valorsacar = sc.nextDouble();
                Double SaldoAtual = valor - valorsacar;
                conta.sacar(valorsacar);
                System.out.println("Conta sacado com sucesso! Saldo atual: " + SaldoAtual);
            }
        } while (Entrada != 0);
    }
    }
