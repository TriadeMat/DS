import java.util.Scanner;
public class executar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        funcoes x = new funcoes();

        int num = scan.nextInt();

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
        }else{
            System.out.println("Erro!!");
        }

    }}

