import java.util.Scanner;

public class exr16_numeroExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 99: ");
        int num = scan.nextInt();
        if ((num < 0) || (num > 99)) {
            System.out.println("Número Inválido");
        } else {
            String resultado = "";

            if (num < 10) {
                if (num == 0)resultado = "zero";
                else if (num == 1) resultado = "um";
                else if (num == 2) resultado = "doi";
                else if (num == 3) resultado = "três";
                else if (num == 4) resultado = "quatro";
                else if (num == 5) resultado = "cinco";
                else if (num == 6)resultado = "seis";
                else if (num == 7) resultado = "sete";
                else if (num == 8) resultado = "oito";
                else resultado = "nove";
            }else if (num < 20) {
                if (num == 10) resultado = "dez";
                else if (num == 11) resultado = "onze";
                else if (num == 12) resultado = "doze";
                else if (num == 13) resultado = "treze";
                else if (num == 14) resultado = "quatorze";
                else if (num == 15) resultado = "quinze";
                else if (num == 16) resultado = "dezesseis";
                else if (num == 17) resultado = "dezessete";
                else if (num == 18) resultado = "dezoito";
                else resultado = "dezenove";
            }else {
                int dezena = num/10;
                int unidade = num %10;
                if (dezena == 2) resultado = "vinte";
                else if (dezena == 3) resultado = "trinta";
                else if (dezena == 4) resultado = "quarenta";
                else if (dezena == 5) resultado = "cinquenta";
                 else if (dezena == 6) resultado = "sessenta";
                 else if (dezena == 7) resultado = "setenta";
                 else if (dezena == 8) resultado = "oitenta";
                 else resultado = "noventa";
                 if (unidade != 0) {
                    resultado += " e ";
                    if (unidade == 1) resultado += "um";
                 else  if (unidade == 2) resultado += "dois";
                 else  if (unidade == 3) resultado += "três";
                 else  if (unidade == 4) resultado += "quatro";
                 else  if (unidade == 5) resultado += "cinco";
                 else  if (unidade == 6) resultado += "seis";
                 else  if (unidade == 7) resultado += "sete";
                 else  if (unidade == 8) resultado += "oito";
                 else resultado += "nove";    
            }
            }
            System.out.println(resultado);
    }
scan.close();}}
