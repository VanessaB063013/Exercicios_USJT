package br.com.ustj.lacorepeticao;

import java.util.Scanner;

/*[for]Faça um programa que recebe a nota de oitenta alunos exibe a maior nota lida.*/




public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota;
		double maiorNota = Integer.MIN_VALUE;
		int i = 1;
		
		for(i=1;i<=80;i++) {
			
			System.out.println("Entre com a nota :");
			nota = leia.nextDouble();
			
			if(nota>maiorNota) {
				
				maiorNota = nota;
			}
			
			
		}
			
			System.out.println("Maior nota : " + maiorNota);
			
		
	}

}
