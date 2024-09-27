package exercicioB;

import java.util.Scanner;

public class exB_maria {

	public static void main(String[] args) {
		// Declaração de variáveis
		
		int num1, num2, num3, num4, res;
		Scanner sc = new Scanner(System.in); 
		
		// Atribuição de valor constante
		
		num2  = 32; 
		num3 = 5;
		num4 = 9; 
		
		//entrada de dados
		
		System.out.print("Digite um número em graus Fahrenheit: ");
		num1 = sc.nextInt();
		
		// Processamento de Dados
		
		res = ((num1 - num2) * num3) / num4; 
		
		// Saída
		
		System.out.println("O resultado final em Celsius é: " + res);
		
		

	}

}
