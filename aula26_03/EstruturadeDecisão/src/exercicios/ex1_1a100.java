
public class ex1_1a100 {
    public static void main(String[] args) {
        int num = 1;
        int somaImpar = 0;
        int somaPar = 0;
        while (num <= 100) {

            if (num % 2 == 0) {
                System.out.println("par: " + num + " ");
                somaPar = num + somaPar;
            } else {
                System.out.print("impar: " + num + " ");
                somaImpar = num + somaImpar;
            }
            num++;
        }
        System.out.println("soma total Par: " + somaPar + " ");
        System.out.println("soma total impar: " + somaImpar + " ");
        if (somaImpar > somaPar) {
            System.out.print("Impar maior que par");
        } else {
            System.out.println("Par maior que impar ");

        }
    }
}
