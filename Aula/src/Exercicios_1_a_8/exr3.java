package Exercicios_1_a_8;
import java.util.Scanner;
public class exr3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2;
        int opcao;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scan.close(); // evita Resource Leak
    }
}
