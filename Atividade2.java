package primeiro_projeto;

import java.util.Scanner;

public class Atividade2 {
	
  public static void main(String[] args) {
    //Variáveis 
    double horatrab,valorhora,salbruto,sallíquido,inss;
    //Instaciar classe Scanner
    Scanner ler = new Scanner (System.in);
    
    //Entrada de dados 
    System.out.println("informa quantas horas vc trabalhou?: ");
    horatrab = ler.nextDouble();
    
    System.out.println("quanto vale cada hora de trabalho?: ");
    valorhora = ler.nextDouble();
    
    //processamento
    salbruto = horatrab*valorhora;
    inss = salbruto*0.12;
    sallíquido = salbruto-inss;
    //Saída
    System.out.println(" O valor do salario liquido é: " +sallíquido+ "O valor do salario bruto é:  "+ salbruto);
    
    
    
    
    
    
    
    



}
