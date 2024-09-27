package aula4;

import java.util.Scanner;

public class if_elseExercício1 {

	public static void main(String[] args) {
		// Entrada 
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, res;
		
		// Declaração de dados
		
		System.out.print("Digite um valor: ");
		a = sc.nextInt();
		
		System.out.print("Digite um segundo valor: ");
		b = sc.nextInt();
		
		// Processamento
		
		if(a>=b) {
			
		res = a - b;
		
		} else {
		
			res = b - a; }
			
		// Saída
			
			System.out.println("A diferença do número maior para o menor é: " + res);
			
	} 
	
	
}
