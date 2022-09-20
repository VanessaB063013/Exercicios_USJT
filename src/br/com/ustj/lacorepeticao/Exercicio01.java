package br.com.ustj.lacorepeticao;

/* [while] Certa pessoa (A) possui R$ 10.000,00 e tem sua fortuna crescendo em R$ 100,00 por mês. Outra pessoa (B) tem sua 
 * fortuna crescendo em R$ 300,00 ao mês e possui R$ 5.000,00.
 *  Faça um programa que exibe, mês a mês, a diferença das duas fortunas até que a pessoa (B) tenha mais dinheiro 
 *  do que a pessoa (A).*/

public class Exercicio01 {

	public static void main(String[] args) {
		
			int pessoaA = 10000;
			int pessoaB = 5000;
			int cresceA = 100;
				int cresceB= 300;
			int cont =0;

		while(pessoaB<pessoaA) {
			
			pessoaA = pessoaA + 100;
			pessoaB = pessoaB + 300;
			cont++;
			System.out.println("pessoa A:" + pessoaA);
			System.out.println("pessoa B:" + pessoaB);
			System.out.println("quantidade meses : " + cont );
				
			
		}
				
				pessoaB= pessoaB+300;
				System.out.println("pessoa A:" + pessoaA);
				System.out.println("pessoa B:" + pessoaB);
				System.out.println("Quantidade de meses :" + (cont+1)); // 


			
			
			
			
        
		

	}

}
