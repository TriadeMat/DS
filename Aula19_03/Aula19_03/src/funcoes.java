public class funcoes {
    int a = 0;
    int b = 10;
    int lado = 10;
    int base = 10;
    int altura = 10;

    public void somar(){
        int res = a + b;
        System.out.println("O resultado da soma: " + res);
    }
    public void subtracao(){
     int res = a - b;
     System.out.println("O resultado da subtração: " + res);
    }
    public void multplicacao(){
        int res = a * b;
        System.out.println("O resultado da multplicação: " + res);
    }
    public void divisao(){
        int res = a / b;
        System.out.println("O resultado da divisão: " + res);
    }
public void areaTriangulo(){
        int res = (base * altura)/2;
        System.out.println("O resultado da área do Triângulo: " + res);
}
public void areaQuadrado(){
        int res =  lado * lado * lado * lado;
        System.out.println("O resultado da área do Quandrado: " + res);
}
}
