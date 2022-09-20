package br.com.ustj.lacorepeticao;
/*/*  Faça um programa que lê o saldo de uma conta corrente e as movimentações feitas nela 
(valores positivos e negativos). Quando uma
movimentação com valor zero for inserida, o programa deverá exibir o saldo final.*/

import java.util.Scanner;



public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		
		double saldo = 0.0;
		double mov = 0.0;
		double saldoFinal= 0.0;
		boolean valido = true;
		double movFinal=0.0;
		
		System.out.println("Entre com o saldo inicial: ");
		saldo = leia.nextDouble();
		while(valido==true) {
			valido=true;
			System.out.println("Entre com a movimentação : ");
			mov = leia.nextDouble();
			
		if(mov!=0 ) {
			valido=true;
			
			movFinal += mov;
			saldoFinal = saldo+movFinal;
			
			
			
		}else if(mov==0 ) {
			
			valido=false;
			System.out.println("Programa finalizado");
			
			
		}
		
		}
		
		System.out.println("Saldo inicial" + saldo);
		System.out.println("Saldo final : " + saldoFinal);		
		
		
	}
}
