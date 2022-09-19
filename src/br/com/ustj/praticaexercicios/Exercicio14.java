package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*aça um programa que recebe três números reais e os exibe em ordem crescente.*/
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro número:");
		double num1 =leia.nextDouble();
		System.out.println("Entre com o segundo número:");
		double num2 = leia.nextDouble();
		System.out.println("Entre com o terceiro número:");
		double num3 = leia.nextDouble();
		
		if(num1<num2 && num1<num3 && num2<num3) {
			System.out.println(num1 + "," + num2 + "," + num3 );
		} else if(num2<num1 && num2<num3 && num1<num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		} else if(num3<num2 && num3<num1 && num1<num2) {
			System.out.println(num3 + "," + num1 +"," + num2);
		} else if(num2<num3 && num2<num1 &&num3<num1) {
			System.out.println(num2 +"," + num3 +"," + num1);
		}else if(num3<num2 && num3<num1 && num2<num1) {
			System.out.println(num3 + "," + num2 +"," + num1);
		}else {
			System.out.println(num1 + ","+ num3 +"," + num2);
		}

	}

}


// para a segunda opção num2<num1 && num2<num3 && num1<num3


