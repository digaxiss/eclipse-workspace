package ExercícioBoolean;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, r; 
		int opc, resp;
		System.out.print("Número: ");
		n1 = sc.nextDouble();
		System.out.print("\n\n ");
		
		do {
			System.out.println("***Calculadora da técnica Mari 1DT***");
			
			// Criação do menu
		
			System.out.print("1- Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Resto de divisão\nEscolha a sua opção: ");
			opc = sc.nextInt(); 
			switch(opc) {
		
				case 1: 
					System.out.print("Número ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 + n2;
					System.out.println("A soma é: "+ r);
					break;
					
				case 2: 
					System.out.print("Número ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 - n2;
					System.out.println("A diferença é: " + r);
					break;
					
				case 3: 
					System.out.print("Número ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 * n2;
					System.out.println("O produto é: "  + r);
					break;
					
				case 4: 
					System.out.print("Número ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 / n2;
					System.out.println("A divisão é: " + r);
					break;
					
				case 5: 
					System.out.print("Número ");
					n1 = sc.nextDouble();
					System.out.printf("\n\n");
					System.out.print("Número: ");
					n2 = sc.nextDouble();
					r = n1 % n2;
					System.out.println("O resto da divisão é: " + r);
					break;
					
					
					
					default:
						
						System.out.println("Opção inválida!");
						break;
					
			}
				System.out.println("Digite 0 para sair ");
				resp = sc.nextInt();
			}while(resp != 0 );		
			
	}
}
	
		

