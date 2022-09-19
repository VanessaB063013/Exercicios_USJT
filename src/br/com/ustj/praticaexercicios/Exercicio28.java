package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um triângulo.
 *  Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: Para que um triângulo exista,
 *  a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.*/

public class Exercicio28 {

	public static void main(String[] args) {
		// triângulo isosceles == dois lados congruentes 
		//  escaleno == todos os lados diferentes
		// equilatero == tres lados iguais
		
		
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Diga o valor da primeira aresta:");
		double a1 = leia.nextDouble();
		System.out.println("Diga o valor da segunda aresta:");
		double a2 = leia.nextDouble();
		System.out.println("Diga o valor da terceira aresta:");
		double a3 = leia.nextDouble();
		
		if(a1<a2+a3 && a2<a1+a3 && a3<a1+a2 ) {
			if (a1==a2 && a1!=a3 || a1==a3 && a1!=a2 || a2==a3 && a2!=a3) {
				System.out.println("Triângulo isósceles");
			}else if(a1!=a2 && a1!=a3 && a2!=a3) {
				System.out.println("Triângulo escaleno");
			}else if (a1==a2 || a1==a3 || a2==a3) {
				System.out.println("Triângulo equilátero");
			}
						
		}else {
			System.out.println("Não é possível formar um triângulo com esses valores");
		}
		

	}

}
