package Exercicios_1_a_8;
import java.util.Scanner;
public class exr7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a área do quadrado: ");
        double area = scan.nextDouble();
        double lado = Math.sqrt(area);
        System.out.println("O lado do quadrado é: " + lado);
        scan.close();
    }

}
