package br.com.ustj.praticaexercicios;
/* Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar*/

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com um número inteiro: ");
		int num = leia.nextInt();
		
		if(num%2==0) {
			System.out.println("O número digitado é par");
		}else {
			System.out.println("O número digitado é ímpar.");
		}

	}

}
