package felicitação;

import javax.swing.JOptionPane;

public class Felicitação {

	public static void main(String[] args) {
		// Entrada
		
		int dia1, dia2, mes1, mes2; // dia1 e mes1 = dia e mês atual dia2 e mes2 = dia e mês do aniversário
		
		dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual: "));
		mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite em que mês estamos: "));
		
		dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu aniverário: "));
		mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversário: "
				+ "1 - janeiro\n"
				+ "2 - fevereiro\n"
				+ "3 - março\n"
				+ "4 - abril\n"
			    + "5 - maio\n"
				+ "6 - junho\n"
				+ "7 - julho\n"
				+ "8 - agosto\n" 
				+ "9 - setembro\n"
				+ "10 - outubro\n"
				+ "11 - novembro\n"
				+ "12 - dezembro\n"));
		
		if(dia1 > dia2 && mes1 > mes2) {
			JOptionPane.showMessageDialog(null, "Seu aniversário já passou. ");
		}else if(dia1 < dia2 && mes1 < mes2) {
			JOptionPane.showMessageDialog(null, "Seu aniversário ainda não chegou. ");
		}else if(dia1 == dia2 && mes1 == mes2)	{
			JOptionPane.showMessageDialog(null, "Parabéns, hoje é seu aniversário!");
		}else if(dia1> dia2 && mes1 <mes2) {
			JOptionPane.showMessageDialog(null, "Seu aniversário ainda não chegou.");
		}else if(dia1 < dia2 && mes1 > mes2) {
			JOptionPane.showMessageDialog(null, "Seu aniversário já passou.");
			
			if(dia2 >= 29 && mes2 == 2) {
				JOptionPane.showMessageDialog(null, "Essa opção não é válida!");
			    }else if(dia1 > 31 && dia2 > 31) {
				    JOptionPane.showMessageDialog(null, "Essa opção não é válida!");
			    }else if(mes1 > 12 && mes2 > 12) {  
			    	JOptionPane.showMessageDialog(null, "Essa opçãp não é válida!");
			    }else if(mes1 <= 0 && mes2 <= 0) {
			    	JOptionPane.showMessageDialog(null, "Essa opçãp não é válida!");
			    }else if(dia1 <= 0 && dia2 <= 0) {
				    JOptionPane.showMessageDialog(null, "Essa opção não é válida!");
		}
	}
	}
}
