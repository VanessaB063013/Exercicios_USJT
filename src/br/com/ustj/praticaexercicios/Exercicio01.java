package br.com.ustj.praticaexercicios;
//Faça um programa que recebe três números reais e exibe a multiplicação desses números.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	       
	       System.out.println("Entre com o primeiro valor: ");
	       double valor1 = leia.nextDouble();
	       System.out.println("Entre com o segundo valor: ");
	       double valor2= leia. nextDouble();
	       System.out.println("Entre com o terceiro valor: ");
	       double valor3 = leia.nextDouble();
	   
	       
	       double result = valor1*valor2*valor3;
	       
	       System.out.println("O resultado da multiplicação dos três números digitados é: " + result);

	}

}
