package exercícioA;

import java.util.Scanner;

public class exA_maria {

	public static void main(String[] args) {
		// Declaração de variáveis
		
		int num1, num2, num3, num4, res; 
		Scanner sc = new Scanner(System.in); 
		
		// Atribuição de valor constante
		
		num2 = 9; 
		num3 = 5; 
		num4 = 32;
		
		// Entrada de dados
		System.out.print("Digite um número em graus Celsius: ");
		num1 = sc.nextInt();
		
		// Processamento de dados
		
		res = num1 * num2 / num3 + num4; 
		
		// Saída
		
		System.out.println("O resultado final em graus Fahrenheit é: "  + res);
		
		
	
		
		
		
		
		
		
		
	    

	}

}
