package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão",
 *  recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores.*/
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ente com o primeiro número: ");
		double num1 = leia.nextDouble();
		System.out.println("Entre com o segundo número: ");
		double num2 = leia.nextDouble();
		
		System.out.println("Escolha uma operação (para tanto, digite o número que se encontra à frente da opção): \n1-Adição \n2-Subtração \n3-Multiplicação \n4-Divisão");
		int opcao = leia.nextInt();
		
		if(opcao == 1 && opcao!=2 && opcao!=3 &&opcao!=4) {
			double result = num1 + num2 ;
			System.out.println("Resultado: " + result);
		}else if(opcao == 2 && opcao !=1 && opcao!=3 && opcao !=4) {
			double result = num1-num2;
			System.out.println("Resultado : " + result);
			
		}else if (opcao == 3 && opcao !=1 && opcao!=2 &&opcao!=4) {
			double result = num1*num2;
			System.out.println("Resultado: " + result);
		}else {
			double result = num1/num2;
			System.out.println("Resultado: " + result);
		}
		

	}

}
