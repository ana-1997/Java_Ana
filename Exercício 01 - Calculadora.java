import java.util.Scanner;

public class Calculadora {
    
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtracao (double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro!");
            return Double.NaN; 
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + adicao(num1, num2));
        System.out.println("Subtração: " + subtracao(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao(num1, num2));
        System.out.println("Divisão: " + divisao(num1, num2));

        scanner.close();
    }
}
