package br.com.ustj.praticaexercicios;


import java.util.Date;
import java.util.Scanner;

/* Faça um programa que recebe duas datas distintas e exibe a mais recente. Cada data deve ser fornecida como três valores inteiros, 
 * onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano.*/
public class Exercicio20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("Digite a primeira data (DD-MM-AAAA):");
		System.out.println("Dia:");
		int dia1 = leia.nextInt();
		System.out.println("Mês:");
		int mes1 = leia.nextInt();
		System.out.println("Ano:");
		int ano1 = leia.nextInt();
		System.out.println(dia1 + "-" + mes1 + "-" + ano1);
		
		System.out.println("");

		System.out.println("Digite a segunda data (DD-MM-AAAA):");
		System.out.println("Dia:");
		int dia2 = leia.nextInt();
		System.out.println("Mês:");
		int mes2 = leia.nextInt();
		System.out.println("Ano:");
		int ano2 = leia.nextInt();
		System.out.println(dia2 + "-" + mes2 + "-" + ano2);
		
		
		
		if(ano1>ano2) {
			System.out.println("A data mais recente é : " + dia1 +"-"+ mes1 + "-" + ano1);
		}else if (ano2>ano1) {
			System.out.println("A data mais recente é :" + dia2 +"-"+ mes2 + "-" + ano2 );
		}else if (ano1==ano2 && mes1>mes2) {
			System.out.println("A data mais recente é: " + dia1 +"-"+ mes1 + "-" + ano1);
		} else if (ano1==ano2 && mes2>mes1) {
			System.out.println("A data mais recente é: " + dia2 +"-"+ mes2 + "-" + ano2);
		} else if (ano1==ano2 && mes1==mes2 && dia1>dia2) {
			System.out.println(" A data mais recente é: " + dia1 +"-"+ mes1 + "-" + ano1);
		}else if(ano1==ano2 && mes1==mes2 && dia2>dia1) {
			System.out.println("A data mais recente é: " + dia2 +"-"+ mes2 + "-" + ano2);
		}
		
		
	}

}
