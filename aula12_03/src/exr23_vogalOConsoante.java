import java.util.Scanner;

public class exr23_vogalOConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        char letra = scan.next().charAt(0);

        if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
            System.out.println(letra + " É uma Vogal: ");
        } else if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
            System.out.println(letra + " É uma Vogal: ");
        } else {
            System.out.println(letra + " É uma consoante");
        }
        scan.close();
    }
}
