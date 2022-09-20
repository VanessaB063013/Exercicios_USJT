package br.com.ustj.lacorepeticao;

import java.util.Scanner;

/* [for] Desenvolva um programa que 
 * exibe a tabuada de um número natural escolhido pelo usuário. Os múltiplos apresentados devem ser de 1 a 10.*/

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i=0;
		int numMult;
		int result=0;
		
		System.out.println("Digite um número:");
		numMult = leia.nextInt();
		for(i=0;i<=10 && i>=0;i++) {
		
			result = numMult*i; 
			
			System.out.println("posição: " + result);
			
			
			
			
		}
		
	}
}
