package br.com.ustj.praticaexercicios;

import java.util.Scanner;

//Faça um programa que recebe dois números inteiros distintos e exibe o maior.

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     
	     System.out.println("Entre com o primeiro numero:");
	     int num1 = leia.nextInt();
	     System.out.println("Entre com o segundo numero:");
	     int num2 = leia.nextInt();
	     
	     if(num1>num2){
	     System.out.println("O maior número digitado foi " + num1);
	     }else{
	      System.out.println("O maior numero digitado foi " + num2);
	     }

	}

}
