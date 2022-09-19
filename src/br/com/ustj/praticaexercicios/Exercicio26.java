package br.com.ustj.praticaexercicios;
/*Faça um programa que recebe o nome e a data de nascimento de duas pessoas e exibe o nome da mais velha. Cada data deve
ser fornecida em três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.*/

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Diga seu nome: ");
		String nome1 = leia.next();
		System.out.println("Digite a sua data de nascimento (DD-MM-AAAA):");
		System.out.println("Dia:");
		int dia1 = leia.nextInt();
		System.out.println("Mês:");
		int mes1 = leia.nextInt();
		System.out.println("Ano:");
		int ano1 = leia.nextInt();
		System.out.println(dia1 + "-" + mes1 + "-" + ano1);
		
		System.out.println("");
		
		System.out.println("Diga seu nome: ");
		String nome2 = leia.next();
		System.out.println("Digite a sua data de nascimento (DD-MM-AAAA):");
		System.out.println("Dia:");
		int dia2 = leia.nextInt();
		System.out.println("Mês:");
		int mes2 = leia.nextInt();
		System.out.println("Ano:");
		int ano2 = leia.nextInt();
		System.out.println(dia2 + "-" + mes2 + "-" + ano2);
		
		if(ano1>ano2) {
			
			System.out.println("A pessoa mais velha é :" + nome2);
		}else if (ano2>ano1) {
			System.out.println("A pessoa mais velha é :" + nome1);
			
		}else if (ano1==ano2 && mes1>mes2) {
			System.out.println("A pessoa mais velha é :" + nome2);

		} else if (ano1==ano2 && mes2>mes1) {
			System.out.println("A pessoa mais velha é :" + nome1);

		} else if (ano1==ano2 && mes1==mes2 && dia1>dia2) {
			System.out.println("A pessoa mais velha é :" + nome2);
		
		}else if(ano1==ano2 && mes1==mes2 && dia2>dia1) {
			System.out.println("A pessoa mais velha é :" + nome1);
			
		
		
		
		

	}
	}
}
