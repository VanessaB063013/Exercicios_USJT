package br.com.usjt.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorDeTemperatura {
// três componentes :texto, label, botão 
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {
			criarTela(); 
		});	
	}
	
	public static void criarTela() {
		
		JFrame tela = new JFrame("conversor");
		JTextField celsiusTextField = new JTextField(10);
		JLabel celsiusLabel = new JLabel("\u00B0C");
		JButton conversao = new JButton ("Converter");
		JLabel valorConvertido = new JLabel("");
		
		Container painelDeConteudo = tela.getContentPane();
		
		painelDeConteudo.setLayout(new GridLayout(2,2,4,4 /*duas linhas e duas colunas + os espaços entre linhas e colunas*/));
		painelDeConteudo.add( celsiusTextField);
		painelDeConteudo.add(celsiusLabel);
		painelDeConteudo.add(conversao);
		painelDeConteudo.add(valorConvertido);
		
		conversao.addActionListener((e) ->{
			double celsius = Double.parseDouble(celsiusTextField.getText());  
			double fahrenheit = (celsius /5*9) + 32;
			valorConvertido.setText(String.format("%.2f\u00B0F",fahrenheit)
			
			);
		});
		
		tela.pack();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		}
}
