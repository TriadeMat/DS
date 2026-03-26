

import java.util.Scanner;

public class exr18_triangulo{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Informe os lados do seu triangulo: ");

        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if ((lado1 > 0 && lado2 > 0 && lado3 > 0)){
             if( (lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)) {
            System.out.println("Você tem um triangulo equilátero");
            }else if ((lado1 == lado2) && (lado1 != lado3) ||(lado1 == lado3) && (lado2 != lado3) ||(lado2 == lado3) && (lado1 != lado3)){
            System.out.println("Triangulo isósceles.");    
            }else if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
            System.out.println("Triangulo Escaleno todos os lados diferentes.");
        }}else{
              System.out.println("Não forma um triângulo");  
    }scan.close();}}
