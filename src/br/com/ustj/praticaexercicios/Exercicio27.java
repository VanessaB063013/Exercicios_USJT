package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/* Faça um programa que recebe a quantidade de cilindradas (cc) 
 * de um veículo de competição e exibe a categoria a qual ele pertence, sendo:
 * • De 0cc a 120cc: “Sub Production”;
• De 121cc a 240cc: “Production”;
• Acima de 240cc: “Super Production”.*/

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a quantidade de cilindradas do veículo (0cc a 240+cc");
		int cilindradas = leia.nextInt();
	
		if(cilindradas>= 0 && cilindradas<=120) {
			System.out.println("Sub Production");
		} else if(cilindradas >=121 && cilindradas<=240) {
			System.out.println("Production");
		}else if (cilindradas>=241) {
			System.out.println("Super production");
		}
		
		
		
	}
}
