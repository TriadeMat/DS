public class exr11_leia3Numeros {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 64;
        if ((a >= b) && (a >= c)) {
            System.out.println("O numero maior é: " + a);
        }else if ((b >= a) && (b >= c)) {
            System.out.println("O numero maior é: " + b);
        }else if ((c >= a) && (c >= b)) {
            System.out.println("O numero maior é: " + c);
        }else{}
    }
}
