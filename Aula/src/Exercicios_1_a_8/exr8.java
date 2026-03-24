package Exercicios_1_a_8;
import java.util.Scanner;
public class exr8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a área do retângulo: ");
        double area = scan.nextDouble();
        System.out.println("Informe a opção desejada: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:System.out.println("Informe a base do retângulo: ");
                double base = scan.nextDouble();
                System.out.println("A altura do retângulo é: " + (area / base));
                break;
                case 2:System.out.println("Informe a altura do retângulo: ");
                double altura = scan.nextDouble();
                System.out.println("A base do retângulo é: " + (area / altura));
                break;
        
            default:
                break;
        }
       
        scan.close();
    }

}
