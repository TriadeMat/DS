import java.util.Scanner;

public class exr19_Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2;
        int opcao;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if ((opcao == 2) && (num2 != 0) && (num1 != 0)) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("Erro: divisão por zero não é permitida.");
            System.out.println("Opção inválida!");
        }
        scan.close();
    }
}
