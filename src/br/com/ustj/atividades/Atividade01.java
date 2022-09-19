// Ler a cotação do dolar e quantidade de dólares. Coverter pra real e mostrar o resultado
package br.com.ustj.atividades;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a cotação do dólar: " );
		double cotacaoDolar = leia.nextDouble();
		System.out.println("Entre com a quantidade de dólares: ");
		double quantidadeDolar = leia.nextDouble();
		
		double conversaoReal = (cotacaoDolar* quantidadeDolar);
		
		System.out.println("O valor, convertido em reais, é R$ " + conversaoReal );
				
			
				

	}

}
