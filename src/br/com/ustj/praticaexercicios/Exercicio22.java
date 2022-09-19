package br.com.ustj.praticaexercicios;
/*Faça um programa que recebe o ano de nascimento de uma pessoa e o ano atual, e exibe a idade dessa pessoa em anos.*/

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o seu ano de nascimento:");
		int anoNascimento = leia.nextInt();
		System.out.println("Entre com o ano em que estamos:");
		int anoAtual = leia.nextInt();
		
		int idade = anoAtual - anoNascimento;
		System.out.println("Você tem " + idade + " anos.");
		
		
}
	

}
