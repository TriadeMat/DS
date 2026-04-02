import java.util.Scanner;

public class testeScan {
    public static void main(String[] args) {
        String nome;
        int  contacorrente;
        int Agencia;
        double saldo;
         double Depositar;
         double sacar;
        double dim ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digeite o Nome do Cliente: ");
        nome = scan.nextLine();

        System.out.println("Digite o numero da conta corrente : ");
        contacorrente= scan.nextInt();

          System.out.println("Digite o numero da Agencia : ");
        Agencia = scan.nextInt();


        System.out.println("Digite o saldo da conta: ");
        saldo= scan.nextDouble();

        
        System.out.println("Digite o valor do Deposito");
         Depositar = scan.nextDouble();
         saldo += Depositar;

          System.out.println("Digite o valor que quer sacar da conta");
         sacar = scan.nextDouble();
         if(sacar>saldo){
            saldo-=sacar;
            System.out.println("Saldo insuficiente");
         }



        
      
        
        scan.close();
System.out.println("---------Dados do Cliente--------");
System.out.println("Sr(a)ClienteMaster: " + nome);
        System.out.println(" numero da conta Corrente: " + contacorrente);
        System.out.println("numero da agencia: " + Agencia);
        System.out.println("O Saldo da sua conta é: R$" +  saldo);
        System.out.println("Valor depositado na sua conta: R$" +  Depositar);
        System.out.println("Valor retirado da conta: R$" +  sacar);
        System.out.println("Valor retirado da conta: R$" +  sacar);
        
    }
}
