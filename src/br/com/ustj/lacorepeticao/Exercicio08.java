package br.com.ustj.lacorepeticao;

import java.util.Scanner;

/*Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.*/

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num =0;
		double media =0.0;
		int cont =0;
		int quantidadeNum;
		boolean valido = true;
		
		System.out.println("Quantos números irá digitar? ");
		quantidadeNum= leia.nextInt();
		while(valido==true) {
			valido=true;
		    System.out.println("Entre com um número inteiro:");
			num=leia.nextInt();
			cont++;
			num += num + num;
			media= num/cont;
			
			if (num >=0 && num<=0) {
				valido=true;
				cont++;
				num += num + num;
				media= num/cont;
			}
			
			
			
		}
		
		System.out.println("A média foi: " + media);
	}
		
		
}

