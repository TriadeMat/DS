import java.util.Scanner;

public class exr13_InformeONumerodaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numerod a semana: Sendo que (1=Domingo, …, 7=Sábado)");
        int numero = scan.nextInt();
        if (numero == 1) {
            System.out.println("Hoje é Domingo!!");
        } else if (numero == 2) {
            System.out.println("Hoje é Segunda-Feira!!");
        } else if (numero == 3) {
            System.out.println("Hoje é Terça-Feira!!");
        } else if (numero == 4) {
            System.out.println("Hoje é Quarta-Feira!!");
        } else if (numero == 5) {
            System.out.println("Hoje é Quinta-Feira!!");
        } else if (numero == 6) {
            System.out.println("Hoje é Sexta-Feira!!");
        } else if (numero == 7) {
            System.out.println("Hoje é Sabado!!");
        } else {
            System.out.println("Erro");
        }

        scan.close();
    }

}
