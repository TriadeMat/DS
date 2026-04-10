package Exercicios;

import javax.swing.JOptionPane;

public class caixaNum {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));//Passegem de Parâmetro

        JOptionPane.showMessageDialog(null,"Sua idade é: " + idade);

    }

}
