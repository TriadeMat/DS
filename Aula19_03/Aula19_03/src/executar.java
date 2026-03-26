import java.util.Scanner;
public class executar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        funcoes x = new funcoes();
       System.out.println("Escreva o valor:");
        x.a = scan.nextInt();
        System.out.println("Escreva o valor: ");
        x.b = scan.nextInt();
        System.out.println("Escolha a operação: ");
        int num = scan.nextInt();

        if ((x.a <= 0) || (x.b <= 0)) {
            System.out.println("Erro!!");
        if (num == 1) {
            x.somar();
        } else if (num == 2) {
            x.subtracao();
        } else if (num == 3) {
            x.multplicacao();
        } else if (num == 4) {
            x.divisao();
        } else if (num == 5) {
            x.areaTriangulo();
        } else if (num == 6) {
            x.areaQuadrado();
        }
        }else{
            System.out.println("Erro!!");
        }

    scan.close();}}

