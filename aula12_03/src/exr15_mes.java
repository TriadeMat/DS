import java.util.Scanner;

public class exr15_mes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o mês, sabendo que é de 1 - 12");
        int mes = scan.nextInt();
        if ((mes != 0) && (mes <= 12)) {
            if (mes == 1) {
                System.out.println(mes + ": Janeiro!!");
            } else if (mes == 2) {
                System.out.println(mes + ": Fevereiro!!");
            } else if (mes == 3) {
                System.out.println(mes + ": Março!!");
            } else if (mes == 4) {
                System.out.println(mes + ": Abril!!");
            } else if (mes == 5) {
                System.out.println(mes + ": Maio!!");
            } else if (mes == 6) {
                System.out.println(mes + ": Junho!!");
            } else if (mes == 7) {
                System.out.println(mes + ": Julho!!");
            } else if (mes == 8) {
                System.out.println(mes + ": Agosto!!");
            } else if (mes == 9) {
                System.out.println(mes + ": Setembro!!");
            } else if (mes == 10) {
                System.out.println(mes + ": Outubro!!");
            } else if (mes == 11) {
                System.out.println(mes + ": Novembro!!");
            } else if (mes == 12) {
                System.out.println(mes + ": Desembro!!");
            }
        } else {
            System.out.println("Erro!!"); 
        }
        scan.close();
    }
}
