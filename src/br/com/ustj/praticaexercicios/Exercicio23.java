package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que recebe duas notas e exibe a média ponderada dessas notas, 
 * considerando peso dois para a primeira e peso três para a segunda.*/
public class Exercicio23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		double nota1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota:");
		double nota2 = leia.nextDouble();
		
		
		
		double media = (nota1*2 + nota2*3)/5;
		System.out.println("Sua media foi: " + media);
		 
		

	}

}
