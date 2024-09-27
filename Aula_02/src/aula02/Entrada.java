package aula02;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// Entrada de dados pelo usuário
		int num1, num2, res; 
		Scanner sc = new Scanner(System.in);
		//entrada de dados
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
	
		System.out.print("Digite um número: ");
		num2 = sc.nextInt();
		//processamento de dados
		res = num1 + num2; 
		//saída
		System.out.print("Resultado: " + res);
	}

}
