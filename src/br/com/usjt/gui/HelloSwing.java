package br.com.usjt.gui;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// Ao trabalhar com interface, temos que especificar sempre o comportamento esperado
public class HelloSwing {

	public static void main(String[] args) {
	//permite definir hierarquia de execução	
	SwingUtilities.invokeLater(()-> {
		criarTela(); //criarTela será executado de forma independente
		// interface gráfica sendo executada em um bloco de operação diferente do fluxo principal do projeto
		
	});	
		
		
	}
	
	
	
	public static void criarTela() {
		//cria a tela
		JFrame tela = new JFrame("Olá, interface!");
		//espera-se que o programa pare quando o usuário clicar no botão de "fechar" ou "sair"
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tipo de conteúdo que exibe texto e que o usuário não consegue editar
		JLabel label = new JLabel("Olá, interface!");
		
		//permite add conteúdo ao quadro(tela)
		//painelDeConteúdo add label dentro da tela
		Container painelDeConteudo = tela.getContentPane();
		
		painelDeConteudo.add(label);
		
		//torna a tela visível
		tela.setVisible(true);
		
		//ajusta automaticamente altura e largura
		tela.pack();
	}

}
