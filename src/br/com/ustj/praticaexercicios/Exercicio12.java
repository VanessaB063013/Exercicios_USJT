package br.com.ustj.praticaexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.*/
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat(".##");
		
		
		System.out.println("Entre com o primeiro número:");
		double num1 = leia.nextDouble();
		System.out.println("Entre com o segundo número:");
		double num2 = leia.nextDouble();
		
		if(num1<num2) {
			System.out.println("O menor número digitado foi: " + formatador.format(num1));
		}else {
			System.out.println("O menor número digitado foi: " + formatador.format(num2));
		}

	}

}
