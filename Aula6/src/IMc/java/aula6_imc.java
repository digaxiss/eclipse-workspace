package IMc.java;

import javax.swing.JOptionPane;

public class aula6_imc {

	public static void main(String[] args) {
		// Declaração de variável
		
		String altura, peso;
		double fAltura, fPeso, IMC;
		altura = JOptionPane.showInputDialog("Digite a sua altura: ");
		fAltura = Float.parseFloat(altura);
		peso = JOptionPane.showInputDialog("Digite o seu peso: ");
		fPeso = Double.parseDouble(peso);
		
		//Processamento de dados
		
		IMC = fPeso / Math.pow(fAltura, 2);
		
		//Decisão
		
		if (IMC <= 18.4) {
			JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Você está muito magro, tente comer melhor!");
		}else if(IMC >=18.5 && IMC <25) {
		    JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Você está com um peso saudável!");
		}else if(IMC >=25 && IMC <30) {
			JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Você está pré-obeso(a), cuide mais da sua saúde!");
		}else if(IMC >= 30 && IMC < 35) {
		    JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Você está com obesidade grau I, perca peso!");
		}else if(IMC >=35 && IMC < 40) {
			JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Você está com obesidade grau II, perca peso rocambole!");
		}else if(IMC >=40) {
			JOptionPane.showMessageDialog(null,String.format("%.2f", IMC) + " Se ficar parado paga IPTU, e se andar paga IPVA.");
		}
		
		
		
	}
         
}
