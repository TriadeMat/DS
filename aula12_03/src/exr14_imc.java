import java.util.Scanner;

public class exr14_imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular seu IMC:Informe seu peso e altura");
        double peso = scan.nextDouble();
        double altura = scan.nextDouble();
        double imc = peso / (altura * altura);
        if ((peso != 0) && (altura != 0)) {
            if (imc < 18.5) {
                System.out.println(imc + " : Abaixo do peso (magreza)");
            } else if ((imc >= 18.5) && (imc <= 24.9)) {
                System.out.println(imc + " : Peso normal");
            } else if ((imc >= 25.0) && (imc <= 29.9)) {
                System.out.println(imc + " : Sobrepeso.");
            } else if (imc >= 30.0) {
                System.out.println(imc + " : Obesidade");
            }
        } else {
            System.out.println("Erro!");
        }
        scan.close();
    }
}
