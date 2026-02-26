package Exercicios_1_a_8;
import java.util.Scanner;
public class exr2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);
        
        scan.close(); // evita Resource Leak
    }
}
