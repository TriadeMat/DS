import java.util.Scanner;
public class exr17_caracterLetraNumeroOuSimbolo {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um caráctere para saber de qual tipo é:");
        char uni = scan.next().charAt(0);

        if ((uni >= 'a' && uni <= 'z') || (uni >= 'A' && uni <= 'Z')){
            System.out.println(uni + " :É uma letra"); 
        }else if (uni >= 0 && uni <= 9) {
            System.out.println(uni + " :É um número");            
        }else{
            System.out.println(uni + " :É uma símbolo");
        }

    scan.close();}

}
