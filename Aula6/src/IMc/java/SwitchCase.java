package IMc.java;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		String opc, n1, n2;
		int iOpc;
		double dN1, dN2; 
		// Criar menu
		opc =  JOptionPane.showInputDialog("1 - Maior número\n"
				+ "2 - Par ou Ímpar\n"
				+ "3 - Posito ou Negativo\n"
				+ "4 - Divisível por 5"
				+ "5 - Soma de 3 números (+/- /0\n" + "Digite a opção: ");
		iOpc = Integer.parseInt(opc);
		
		// Processamento
		
		switch(iOpc) { 
		case 1:
			n1=JOptionPane.showInputDialog("Número: ");
			dN1 = Double.parseDouble(n1);
			n2=JOptionPane.showInputDialog("Número: ");
			dN2 = Double.parseDouble(n2);
			
		// Processamento
			
			if (dN1 > dN2) {
				JOptionPane.showMessageDialog(null, dN1+"é maior"); 
			} else if (dN1 > dN2) {
			  JOptionPane.showMessageDialog(null, dN2+ "é maior");
			}else {
				JOptionPane.showMessageDialog(null, dN1);
			}
		}

	}

}
