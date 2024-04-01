import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, ContaBancaria> contas = new HashMap<>();

      
        ContaBancaria conta1 = new ContaBancaria(123, "João");
        ContaBancaria conta2 = new ContaBancaria(456, "Maria");

   
        contas.put(conta1.getNumeroConta(), conta1);
        contas.put(conta2.getNumeroConta(), conta2);

        int opcao;
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Acessar conta existente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número da conta: ");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome do titular: ");
                    String nomeTitular = scanner.nextLine();
                    ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular);
                    contas.put(novaConta.getNumeroConta(), novaConta);
                    System.out.println("Nova conta criada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    int numeroContaAcesso = scanner.nextInt();
                    ContaBancaria contaAcessada = contas.get(numeroContaAcesso);
                    if (contaAcessada != null) {
                        acessarConta(contaAcessada, scanner);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void acessarConta(ContaBancaria conta, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu de Operações para a Conta de " + conta.getNomeTitular() + ":");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}