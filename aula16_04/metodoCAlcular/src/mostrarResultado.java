import java.util.Scanner;

public class mostrarResultado {
    public static void main(String[] args) {
        metodoCalcular valor = new metodoCalcular();
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = scan.nextDouble();
        valor.setPrimeiroValor(x);

        System.out.println("Digite o Segundo valor: ");
        y = scan.nextDouble();
        valor.setSegundoValor(y);

        valor.somar();
    }
}
