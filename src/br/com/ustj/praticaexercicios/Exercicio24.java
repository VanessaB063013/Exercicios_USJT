package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que, a partir da idade e o ano atual, calcule e exiba a idade que a pessoa teria na virada do próximo século*/
public class Exercicio24 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a sua idade: ");
		int idadeAtual = leia.nextInt();
		System.out.println("Entre com o ano atual: ");
		int anoAtual = leia.nextInt();
		
		//20100 vira o seculo
		
		// idade da pessoa e mostrar quantos anos ela terá em 20101
		
		int supostaIdade = (2101 - anoAtual) + idadeAtual  ;
		
		System.out.println("Caso você viva até a virada do século, você terá " + supostaIdade + " anos.");
		
		

	}

}
