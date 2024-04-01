import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<Livro>();

        System.out.println("Insira as informações do primeiro livro:");
        System.out.print("Título: ");
        String titulo1 = scanner.nextLine();

        System.out.print("Autor: ");
        String autor1 = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao1 = scanner.nextInt();

        scanner.nextLine();

        Livro livro1 = new Livro(titulo1, autor1, anoPublicacao1);

        biblioteca.add(livro1);

        System.out.println("\nInformações do Primeiro Livro:");
        livro1.exibirInfo();

        System.out.println("\nInsira as informações do segundo livro:");
        System.out.print("Título: ");
        String titulo2 = scanner.nextLine();

        System.out.print("Autor: ");
        String autor2 = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao2 = scanner.nextInt();

        scanner.nextLine();

        Livro livro2 = new Livro(titulo2, autor2, anoPublicacao2);

        biblioteca.add(livro2);

        System.out.println("\nInformações do Segundo Livro:");
        livro2.exibirInfo();

        System.out.println("\nLivros na Biblioteca:");
        for (Livro livro : biblioteca) {
            livro.exibirInfo();
            System.out.println();
        }

        scanner.close();
    }
}
