import java.util.Scanner;
public class exr6_senha {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("informe sua senha: ");
int senha = scan.nextInt();

if (senha == 1312 ){
    System.out.println("Senha correta!!");    
}else{
    System.out.println("Senha Incorreta!!");
}

scan.close();}}
