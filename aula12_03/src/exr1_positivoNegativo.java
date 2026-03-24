import java.util.Scanner;

public class exr1_positivoNegativo {
   public exr1_positivoNegativo() {
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Inseria um número: ");
      int numero = scan.nextInt();
      if (numero > 0) {
         System.out.println("Número é positivo!");
      } else{
         System.out.println("Número negativo!");
    

      scan.close();
   }
}
}