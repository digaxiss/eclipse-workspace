package aula5;

import javax.swing.JOptionPane;

public class saudaçãoJOptionPane {

	public static void main(String[] args) { 
		String nome, snome, aux, genero;
		int idade, aposentar;
		
		// Entrada com perguntas
		nome = JOptionPane.showInputDialog("Digite seu primeiro nome: ");
		snome = JOptionPane.showInputDialog("Digite seu sobrenome nome: ");
		genero = JOptionPane.showInputDialog("DIgite seu gênero: ");
		
	    genero.toUpperCase();
	    
		// Pergunta da idade
		
		aux = JOptionPane.showInputDialog("Qual a sua idade? ");
		
		// Conversão para Int
		idade = Integer.parseInt(aux);//=16
		
		if (idade>=65)
		JOptionPane.showMessageDialog(null, nome + " " + snome + " "
					+", sua idade é " + idade + " anos "
					+ " já pode descansar!");
		else if (idade>=16) {
		JOptionPane.showMessageDialog(null, nome + " " + snome + " "
										+", sua idade é " + idade + " anos "
										+ " já pode trabalhar!");		
		
	} else {
		JOptionPane.showMessageDialog(null, nome + " " + snome + " "
				+ " sua idade é: " + idade + " anos" + " vai estudar!");
	

	} if (genero.equals ("F") || genero.equals ("f") || genero.equals ("feminino")
			|| genero.equals ("Feminino") || genero.equals ("FEMININO")) {
		if(idade<60) {
			aposentar = 60 - idade;
			JOptionPane.showMessageDialog(null, "Você já está aposentada! ");
		} 
		 else if(genero.equals ("M") || genero.equals ("m") || genero.equals ("masculino")
			|| genero.equals ("Masculino") || genero.equals ("MASCULINO")) {
		if(idade<65) {
			aposentar = 65 - idade;
			JOptionPane.showMessageDialog(null, "Você já está aposentado! ");
			}
	}
		
	
		
		
} 
	}}
