package exercícioC;

import java.util.Scanner;

public class exC_maria {

	public static void main(String[] args) {
		// Declaração de variáveis
	
		double num1, num2, num3, res; 
		
		Scanner sc = new Scanner(System.in);
		
		//Atribuição de valor constante
		
		num1 = 3.14159;
	   
	    // Entrada de dados
	    
	    System.out.print("Digite o valor do raio da lata de óleo: ");
		num2 = sc.nextInt();
		
		 System.out.print("Digite o valor da altura da lata de óleo: ");
		 num3 = sc.nextInt();

		 // Processamento de dados
		 
		 res = num1 * (num2 * num2) * num3; 
		 System.out.println("O valor final do volume da lata é: " + res);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
