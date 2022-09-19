package br.com.ustj.praticaexercicios;
/*Faça  um  programa  que exibe  quantos  litros  de  combustível  são  gastos  por  um  carro  em  um dado percurso. 
 * Serão fornecidos pelo usuário a distância percorrida(em km)e a quantidade de litros gastos por km.*/

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com a distância percorrida em km:");
		double kmRodado = leia.nextDouble();
		System.out.println("Entre com a quantidade de litros gastos por km:");
		double listrosGastosKm = leia.nextDouble();
		
		
		double litrosGastosPercurso = kmRodado/listrosGastosKm;
		System.out.println("Seu veículo gastou " + litrosGastosPercurso + " neste percurso" );
		

	}

}
