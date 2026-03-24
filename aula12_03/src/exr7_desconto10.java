import java.util.Scanner;

public class exr7_desconto10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o preço do produto: ");
        double precoPd = scan.nextDouble();
        double desconto = (precoPd * 10) / 100;
        if (precoPd >= 100) {
            precoPd = precoPd - desconto;
            System.out.println(
                    "Seu desconto foi de: R$:" + desconto + " e com isso valor do seu produto é: R$:" + precoPd);
        } else {
            System.out.println("Sem desconto o valor do produto é: R$:" + precoPd);
        }
        scan.close();
    }
}