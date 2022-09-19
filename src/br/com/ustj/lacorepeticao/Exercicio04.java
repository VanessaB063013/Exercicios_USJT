
package br.com.usjt.lacorepeticao;

import java.util.Scanner;

/*[for] Faça um programa que lê cem idades de pacientes e exibe as idades do mais novo e do mais velho.*/

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i = 1;
		int idade;
		int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;
		
		
		for(i=1; i>=0 && i<=100;i++) {
			System.out.println("Entre com a idade : ");
			idade =leia.nextInt();
			
			
			if(idade> maiorIdade) {
			maiorIdade=idade;
			} if(idade<menorIdade)
				menorIdade = idade;
				
		}
		
		System.out.println("maior idade : " + maiorIdade);
		System.out.println("menor idade : " + menorIdade);
	}

}
