import java.util.Scanner;

public class exr20_faixaEtaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        if (idade <= 12 && idade >= 1) {
            System.out.println(idade + " :anos de idade, Criança!");

        } else if ((idade >= 13) && (idade <= 17)) {
            System.out.println(idade + " :anos de idade, Jovem!");

        } else if (idade >= 18 && idade <= 59) {
            System.out.println(idade + " :anos de idade, Adulto!");

        } else if (idade >= 60) {
            System.out.println(idade + " :anos de idade, Idoso!");

        } else {
            System.out.println("Digite uma idade válido! ");

        }
        scan.close();
    }
}
