package exercícioD;

import java.util.Scanner;

public class exD_maria {

	public static void main(String[] args) {
		// Entrada de variáveis
	
		double num1, num2, num3, num4, res; 
		Scanner sc = new Scanner(System.in);
		
		// Entrada de dados
		
		System.out.print("Digite o tempo de viagem em minutos: ");
		num1 = sc.nextInt();
		
		 System.out.print("Digite a velocidade média em quilômetros: ");
		 num2 = sc.nextInt();
		 
		 // Atribuição de valor constante
		 
		 num4 = 12;
		 
		 // Processamento
		 
		 num3 = num1 * num2; 
		 System.out.println("A distância percorrida é: " + num3);
		 
		 // Saída
		 res = num3 / num4; 
		 System.out.println("A quantidade de litros usados de gasolina durante a viagem foi de: " + res);
		 
		 
		 
		 
	}

}
