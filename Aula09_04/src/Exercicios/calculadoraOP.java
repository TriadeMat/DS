package Exercicios;

import javax.swing.JOptionPane;

public class calculadoraOP {
    public static void main(String[] args) {

        funcoes func = new funcoes();
        func.numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro valo: "));
        func.numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo vaor: "));
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a Operação: 1 = somar; 2 = subtrair; 3 = dividir "));

        if (operacao == 1) {
            func.somar();
        }else if (operacao == 2) {
            func.subtracao();
        }else if (operacao == 3) {
            func.divisao();
        }else if (operacao == 4) {
            func.multplicacao();
        }

    }

}
