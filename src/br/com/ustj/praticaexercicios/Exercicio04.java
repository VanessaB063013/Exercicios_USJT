package br.com.ustj.praticaexercicios;

import java.util.Scanner;

//Faça um programa que recebe as notas P1, P2 e P3 e exibe a média considerando
//que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3 tem peso 4..

public class Exercicio04 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner (System.in);
		 
		 System.out.println("Entre com a primeira nota: ");
		    double nota1 = leia.nextDouble();
		    System.out.println("Entre com a segunda nota: ");
		    double nota2 = leia.nextDouble();
		    System.out.println("Entre com a terceira nota: ");
		    double nota3 = leia.nextDouble();
		    
		  /* double peso1 = 3;
		    double peso2 = 3;
		    double peso3= 4;*/
		    
		    double notaPeso1 = nota1 * 3;
		    double notaPeso2 = nota2 * 3;
		    double notaPeso3 = nota3 * 4;
		    
		    double media = (notaPeso1 + notaPeso2 + notaPeso3)/3;    
		   
		    System.out.println("Sua média é: " + media); 

	}

}
