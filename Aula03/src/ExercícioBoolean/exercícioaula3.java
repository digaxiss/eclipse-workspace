package ExercícioBoolean;

import java.util.Scanner;

class exercícioaula3 {

	public static void main(String[] args) {
		// Entrada
		
		Scanner sc = new Scanner(System.in);
		
	    // Atribuição de dados
		
		double a, b;
		
		// Operadores de atribuição: +=, -=, *=, /=, %=
		
		System.out.print("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor decimal: ");
		b = sc.nextDouble();
		
		System.out.println("A soma é: " + a);
		a+=b;
		
		//
		
		System.out.print("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor decimal: ");
		b = sc.nextDouble();
		
		System.out.println("A dierença é: " + a);
		a-=b;
		
		//
		
		System.out.print("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor decimal: ");
		b = sc.nextDouble();
		
		System.out.println("O produto é: " + a);
		a*=b;
		
		//
		
		System.out.print("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor decimal: ");
		b = sc.nextDouble();
		
		System.out.println("A divisão é: " + a);
		a/=b;
		
		//
		
		System.out.print("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.print("Digite um valor decimal: ");
		b = sc.nextDouble();
		
		System.out.println("O resto da divisão é: " + a);
		a%=b;
		
	
	}

}
