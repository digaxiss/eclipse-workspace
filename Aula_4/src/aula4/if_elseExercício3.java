package aula4;

import java.util.Scanner;

public class if_elseExercício3 {
	public static void main(String[] args) {
		// Entrada
		
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, n5, md1, ne, md2; 
		n5 = 4;
		
		// Declaração de dados
		
		System.out.print("A nota do primeiro bimestre do aluno é: ");
		n1 = sc.nextDouble();
		System.out.print("A nota do segundo bismestre do aluno é: ");
		n2 = sc.nextDouble();
		System.out.print("A nota do terceiro bimestre do aluno do aluno é: ");
		n3 = sc.nextDouble();
		System.out.print("A nota do quarto bimestre do aluno é: ");
		n4 = sc.nextDouble();
		
		// Processamento
		
		md1 = (n1 + n2 + n3 + n4) / n5;
		System.out.println("A média do aluno é: " + md1);
		
		if (md1>=7) {
			System.out.println("Aprovado ");
		}else {
			System.out.print("Necessário inserir a nota do exame: ");
			ne = sc.nextDouble();
			
			System.out.print("A média final do aluno é: ");
			md2 = (md1 + ne)/2;
			
			if (md2>=5) {
				System.out.print("O aluno foi APROVADO no exame. ");
			}else {
				System.out.print("O aluno foi REPROVADO  no exame. ");
			}
		}
		

	}

}
