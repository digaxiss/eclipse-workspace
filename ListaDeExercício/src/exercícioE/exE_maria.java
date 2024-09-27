package exercícioE;

import java.util.Scanner;

public class exE_maria {

	public static void main(String[] args) {
		// Entrada de variáveis
		
		double num1, num3, num4, res;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		// Atribuição de valor constante
		
		num3 = 100;
		
		// Declaração de dados
		
		System.out.print("Digite o valor da prestação: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o percentual da taxa: ");
		num2 = sc.nextInt();
		
		System.out.print("Digite em dias o tempo de atraso do pagamento: ");
		num4 = sc.nextDouble();
		
		// Processamento
		
		res = num1 + (num1 * (num2 / num3) * num4);
		
		// Saída
		
		System.out.println("O valor a ser pago devido ao atraso da prestação é: " + res);
		

	}

}
