package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. 
 * Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2*/
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a base do primeiro triângulo: ");
		double base1 = leia.nextDouble();
		System.out.println("Entre com a altura do primeiro triângulo: ");
		double alt1 = leia.nextDouble();
		
		System.out.println("Entre com a base do segundo triângulo: ");
		double base2 = leia.nextDouble();
		System.out.println("Entre com a altura do segundo triângulo: ");
		double alt2 = leia.nextDouble();
		
		System.out.println("Entre com a base do terceiro triângulo: ");
		double base3 = leia.nextDouble();
		System.out.println("Entre com a altura do terceiro triângulo: ");
		double alt3 = leia.nextDouble();
		
		double area1 = (base1*alt1)/2;
		double area2 = (base2*alt2)/2;
		double area3 = (base3*alt3)/2;
		
		if(area1>area2 && area1>area3) {
			System.out.println("Maior área: " + area1);
		}else if (area2>area1 && area2>area3) {
			System.out.println("Maior area: " + area2);
		}else {
			System.out.println("Maior área:" + area3);
		}
		
		

	}

}
