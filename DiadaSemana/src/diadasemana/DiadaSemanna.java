package diadasemana;

import javax.swing.JOptionPane; 

public class DiadaSemanna {

	public static void main(String[] args) {
 		// Entarada
		
		String DiaSemana;//, dom, seg, ter, qua, qui, sex, sab; 
		int iDiaSemana;//,   idom, iseg, iter, iqua, iqui, isex, isab;
		DiaSemana = JOptionPane.showInputDialog("Digite em qual dia da semana estamos: "
				+ "1 - domingo\n"
				+ "2 - segunda\n"
				+ "3 - terça\n"
				+ "4 - quarta\n"
				+ "5 quinta\n"
				+ "6 - sexta\n"
				+ " 7 - sábado\n");
		
		iDiaSemana = Integer.parseInt(DiaSemana);
		if (iDiaSemana == 1 || iDiaSemana == 7) {
			JOptionPane.showMessageDialog(null, " Estamos em um FINAL DE SEMANA! " + DiaSemana);
		}else if (iDiaSemana >= 2 && iDiaSemana <= 6 ) {
			JOptionPane.showMessageDialog(null, " Estamos em um DIA ÚTIL! " + DiaSemana);
			
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}

}
