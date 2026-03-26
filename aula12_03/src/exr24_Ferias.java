import java.util.Scanner;

public class exr24_Ferias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Infome o número do mês que estamos: 01 a 12 ");
        int mes = scan.nextInt();

        if (mes == 01 || mes == 07 || mes == 12) {
            System.out.println("Mês de ferias!!");
        } else {
            System.out.println("Mês Letivo!!");
        }
        scan.close();
    }
}
