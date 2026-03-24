package Exercicios_1_a_8;
import java.util.Scanner;
public class exr4 {
      public static void main(String[] args) {
        
        System.out.println("Digite o tamanho de um lado do quadrado: ");
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area);
      
        scan.close();

}
}
