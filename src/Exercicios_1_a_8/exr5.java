package Exercicios_1_a_8;
import java.util.Scanner;
public class exr5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       System.out.println("Informe a base do retângulo: ");
       double base = scan.nextDouble();
       System.out.println("Informe a altura do retângulo: ");
       double altura = scan.nextDouble();
       double area = base * altura;
       System.out.println("A área do retângulo é: " + area);



        scan.close();
    }

}
