import java.util.Scanner;

public class exr12_menorAdultoIdoso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento: ");
        int dtnascimento = scan.nextInt();
        int idade = 2026 - dtnascimento;
        if (idade <= 17) {
            System.out.println("Menor de idade: " + idade);
        }else if((idade >=18) && (idade <=63)){
            System.out.println("Adulto: " + idade);
        }else if (idade >= 64) {
            System.out.println("Idoso: " + idade);  
        }else{}
    scan.close();}

}
