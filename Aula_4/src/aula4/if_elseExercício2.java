package aula4;

import java.util.Scanner;

public class if_elseExercício2 {

	public static void main(String[] args) {
		// Entrada
		
		Scanner sc = new Scanner(System.in); 
		int n, res;
		
		// Declaração de dados
		
		System.out.print("Digite um número inteiro negativo ou positivo: ");	
		n = sc.nextInt();
		
		if(n<0) {
			
		// Processamento
			
			res = n * -1;
			
		}else {
			
			res = n * 1; 
		}
		
		// Saída
		
		System.out.print("O resultado é: " + res);
	}

}
