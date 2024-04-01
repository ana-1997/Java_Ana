import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<Carro>();

        System.out.println("*--- Cadastro de Carros ---*");
        while (true) {
            System.out.println("\nDigite os dados do carro:");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Placa: ");
            String placa = scanner.nextLine();

            Carro novoCarro = new Carro(marca, modelo, ano, placa);
            carros.add(novoCarro);

            System.out.print("Deseja cadastrar outro carro? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("\n*--- Carros Cadastrados ---*");
        for (Carro carro : carros) {
            carro.exibirInformacoes();
            System.out.println();
        }

        System.out.println("\n*--- Acelerar e Frear ---*");
        System.out.print("Digite a posição do carro que deseja acelerar (0 - N): ");
        int posicao = scanner.nextInt();
        if (posicao >= 0 && posicao < carros.size()) {
            Carro carroSelecionado = carros.get(posicao);
            System.out.print("Digite a quantidade de aceleração: ");
            int quantidadeAceleracao = scanner.nextInt();
            carroSelecionado.acelerar(quantidadeAceleracao);

            scanner.nextLine(); 

            System.out.print("Digite a quantidade de frenagem: ");
            int quantidadeFrenagem = scanner.nextInt();
            carroSelecionado.frear(quantidadeFrenagem);

            System.out.println("\n=== Informações do Carro ===");
            carroSelecionado.exibirInformacoes();
        } else {
            System.out.println("Posição inválida.");
        }

        scanner.close();
    }
}
