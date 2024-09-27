package IMc.java;

import javax.swing.JOptionPane;

public class PerímetroCirculo {

	public static void main(String[] args) {
		// Declação de variáveis
				String raio;
				float fRaio, PC;
				
				// Entrada de dados
				
				raio = JOptionPane.showInputDialog("Digite o raio: ");
				fRaio = (float) Double.parseDouble(raio);
				PC = (float) (Math.PI * fRaio);
				JOptionPane.showMessageDialog(null,  "O perímetro do circulo é: ");


	}

}
