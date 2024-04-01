import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<Jogador>();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarNovoJogador(jogadores, scanner);
                    break;
                case 2:
                    aumentarPontuacao(jogadores, scanner);
                    break;
                case 3:
                    subirNivel(jogadores, scanner);
                    break;
                case 4:
                    exibirInformacoes(jogadores, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\nMenu de Operações:");
        System.out.println("1. Criar novo jogador");
        System.out.println("2. Aumentar Pontuação de um jogador");
        System.out.println("3. Subir de Nível de um jogador");
        System.out.println("4. Exibir Informações de um jogador");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void criarNovoJogador(List<Jogador> jogadores, Scanner scanner) {
        System.out.println("Criando novo jogador:");
        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.next();
        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacao = scanner.nextInt();
        System.out.print("Digite o nível inicial do jogador: ");
        int nivel = scanner.nextInt();
        Jogador novoJogador = new Jogador(nome, pontuacao, nivel);
        jogadores.add(novoJogador);
        System.out.println("Novo jogador criado com sucesso!");
    }

    public static void aumentarPontuacao(List<Jogador> jogadores, Scanner scanner) {
        System.out.print("Digite o nome do jogador que deseja aumentar a pontuação: ");
        String nome = scanner.next();
        boolean encontrado = false;
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite a quantidade de pontos a serem adicionados: ");
                int pontos = scanner.nextInt();
                jogador.aumentarPontuacao(pontos);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jogador não encontrado.");
        }
    }

    public static void subirNivel(List<Jogador> jogadores, Scanner scanner) {
        System.out.print("Digite o nome do jogador que deseja subir de nível: ");
        String nome = scanner.next();
        boolean encontrado = false;
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                jogador.subirNivel();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jogador não encontrado.");
        }
    }

    public static void exibirInformacoes(List<Jogador> jogadores, Scanner scanner) {
        System.out.print("Digite o nome do jogador que deseja exibir as informações: ");
        String nome = scanner.next();
        boolean encontrado = false;
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                jogador.exibirInformacoes();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Jogador não encontrado.");
        }
    }
}





