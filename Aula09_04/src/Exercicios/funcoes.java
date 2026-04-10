package Exercicios;

import javax.swing.JOptionPane;

public class funcoes {
    int numero1 = 10;
    int numero2 = 10;


    public void somar(){
        int res = numero1 + numero2;
       JOptionPane.showMessageDialog(null,"Resultado: " + res);
    }
    public void subtracao(){
     int res = numero1 - numero2;
      JOptionPane.showMessageDialog(null,"Resultado: " + res);
    }
    public void multplicacao(){
        double res = numero1 * numero2;
         JOptionPane.showMessageDialog(null,"Resultado: " + res);
    }
    public void divisao(){
        if ((numero1 == 0 )||(numero2 == 0 )) {
            JOptionPane.showMessageDialog(null, "Erro!!");
     
            
        }else{
        double res = numero1 / numero2;
        JOptionPane.showMessageDialog(null,"Resultado: " + res);}
    }
}
