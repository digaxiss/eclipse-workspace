package diadasemana;

import javax.swing.JOptionPane;

public class diadasemanaSwithCase {

	public static void main(String[] args) {
		// Declaração de variável
		
		String opc;
		int iopc; 
		
		// Entrada
		
		opc = JOptionPane.showInputDialog("Em qual dia da semana estamos? \n"
				+ "1 - domingo\n"
				+ "2 - segunda\n"
				+ "3 - terça\n"
				+ "4 - quarta\n"
				+ "5 - quinta\n"
				+ "6 - sexta\n"
				+ "7  - sábado\n"); 
		
		iopc = Integer.parseInt(opc);
	switch (iopc) {
	case 1:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Domingo ");
	break;
	case 2:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Segunda-Feira ");
	break;
	case 3:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Terça-Feira ");
	break;
	case 4:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Quarta-Feira ");
	break;
	case 5:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Quinta-Feira " );
	break;
	case 6:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Sexta-Feira ");
	break;
	case 7:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é Sábado ");
	break;
	default:
		JOptionPane.showMessageDialog(null, "O dia da semana informado é inválido ");
	break;
		
		
			
		}
	
	}

}
