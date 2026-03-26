import java.util.Scanner;
public class exr22_imposto {
    //Dado um salário, aplique imposto em diferentes faixas (ex: ≤ 2000 – isento; ≤ 3000 – 10%; >3000 – 15%).  
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe o salário: ");
        double salario = scan.nextDouble();
        double imposto ;
        if (salario != 0) {
        if (salario <= 2000) {
        System.out.println("Você está Isento de imposto!!");            
        }else if (salario <= 3000) {
           imposto = (salario * 10)/100;
           salario = salario - imposto;
            System.out.println("imposto de: R$" + imposto + " Salario fica: R$" + salario);
        }else if (salario > 3000) {
            imposto = (salario * 15)/100;
           salario = salario - imposto;
         System.out.println("imposto de: R$" + imposto + " Salario fica: R$" + salario);          
        }}else{
            System.out.println("Erro!!");
        }

    scan.close();}

}
