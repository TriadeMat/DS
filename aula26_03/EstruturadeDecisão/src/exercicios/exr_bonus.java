import java.util.Scanner;

public class exr_bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe suas notas de:1 a 10");
        int nota = 0;
        while (nota <= 10) {
            nota = scan.nextInt();

            if (nota == 11) {
                System.out.println("Númeor de nota errado!!");
                return;
            } else {
            }
            scan.close();
        }
    }
}
