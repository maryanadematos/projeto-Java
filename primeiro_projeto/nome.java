package primeiro_projeto;

import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
		// Variáveis
		 String nome,idade;
		
		//Instaciar Classe Scanner 
		Scanner ler = new Scanner(System.in);
		 
		//Entrada de dados 
		System.out.println("Informe nome: ");
		nome = ler.next();
		
		System.out.println("Informe idade:");
		idade =ler.next();
		
		//processamento
		
		System.out.println ("seu nome e sua idade"+nome+idade);
		
	

	}

}
