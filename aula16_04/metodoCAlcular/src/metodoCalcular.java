/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author MATHEUS_5340
 */
    public class metodoCalcular {
 double resultado;
 double primeiroValor;
 double segundoValor;
 
 public void somar(){
  resultado = getPrimeiroValor() + getSegundoValor();
  System.out.println("O valor da soma é: " + getResultado());
 }
 public void setPrimeiroValor(double primeiroValor){
    this.primeiroValor = primeiroValor;
 }
 public double getPrimeiroValor(){
    return primeiroValor;
 }
 public void setSegundoValor(double segundoValor){
    this.segundoValor = segundoValor;
 } 
 public double getSegundoValor(){
    return segundoValor;
 }
    public void setResultado(){
        this.resultado = resultado;
    }
    public double getResultado(){
        return resultado;
    }
}
