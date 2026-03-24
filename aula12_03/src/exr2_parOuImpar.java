import java.util.Scanner;

public class exr2_parOuImpar {
   public exr2_parOuImpar() {
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Informe um numero: ");
      int numero = scan.nextInt();
      if (numero % 2 == 0) {
         System.out.println("Seu numero é par.");
      } else{
         System.out.println("Seu número é ímpar.");
      }

      scan.close();
   }
}
