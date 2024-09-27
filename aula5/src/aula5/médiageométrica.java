package aula5;

import java.util.Scanner;

public class médiageométrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis
		double a, b, c, r, mg;
		
		// Entrdaa de dados
		
		System.out.print("Digite o primeiro número: ");
		a = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		b = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		c = sc.nextDouble();
		
		// Processamento
		
		r = (a + b + c) / 3;
		
		mg = Math.pow(a * b * c, 1.0/3.0);
		
		// Saída
		System.out.printf("\nA média é: %.2f", r);
		System.out.printf("\nA média geométrica é: %.2f", mg);
		
		sc.close();
	}

}
