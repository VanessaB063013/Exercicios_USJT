package br.com.usjt.aulapraticapoo;

import java.util.Scanner;

public class TestaJogadores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Jogadores jogadores = new Jogadores();

		System.out.println("Quantos jogadores deseja inserir? ");
		int quantidadeJogadores = leia.nextInt();

		while (quantidadeJogadores >= jogadores.getContador()) {
			jogadores.ContadorJogador();

			System.out.println("Nome do Jogador: ");
			String nome = leia.next();
			System.out.println("Seleção: ");
			String selecao = leia.next();
			System.out.println("Número da Camisa: ");
			int numero = leia.nextInt();

			jogadores.setNome(nome);
			jogadores.setSelecao(selecao);
			jogadores.setNumero(numero);
			jogadores.getNome();
			jogadores.getSelecao();
			jogadores.getNumero();

			jogadores.ExibirMensagem();

		}

		jogadores.ComparaQuantidade();

	}
		
		

		
		
		
	
		
		
		
		
		
	
	}
	
