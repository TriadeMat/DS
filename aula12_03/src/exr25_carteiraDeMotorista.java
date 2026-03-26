import java.util.Scanner;
public class exr25_carteiraDeMotorista {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Possui habilitação? (true/false): ");
        boolean habilitacao = scan.nextBoolean();

        if (idade >= 18 && habilitacao) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        scan.close();
    }
}