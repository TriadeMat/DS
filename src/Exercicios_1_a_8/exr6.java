package Exercicios_1_a_8;
import java.util.Scanner;

public class exr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe a base do triângulo: ");
        double base = scan.nextDouble();
        System.out.println("informe a altura do triângulo: ");
        double altura = scan.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        scan.close();
    }

}
