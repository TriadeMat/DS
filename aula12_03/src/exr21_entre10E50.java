import java.util.Scanner;
public class exr21_entre10E50 {
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int num = scan.nextInt();
    if (num >= 10 && num <= 50) {
        System.out.println(num + " está entre 10 e 50!");
    }else{System.out.println("Não Esta entre 10 e 50!!");}
scan.close();}
}
