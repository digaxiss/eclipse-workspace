/*Armazene seu nome, idade e salário e apresente na tela
 */
package aula2;

public class DadosCadastrais {
	
	public static void main (String []args) {
	//Entrada com declarações de variáveis
	String nome;
	int idade; 
	double salario; 
	
	//Atribuir valor constante: 
	nome = "Mari"; 
	idade = 16; 
	salario = 206.00;
			
			//Processamento: manipulação de variáveis
			idade = idade + 10; //idade+=10
			salario = salario * 1.2; //salario*=1.2 => 20% aum.
			
			++idade; 
			
			//Saída
			System.out.println("Olá, "+ nome); 
			System.out.println("A idade final informada é:" + idade);
			System.out.println("O salario pago para nossos alunos é: " + salario);
	}
}