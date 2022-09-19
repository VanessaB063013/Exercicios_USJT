package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*   Faça um programa que recebe duas notas, exibe a média aritmética das notas e uma mensagem indicando 
se o aluno foi aprovado ou reprovado. 
A média para aprovação deve ser maior que seis.*/
public class Exercicio03 {
	public static void main(String[] args) {
		  Scanner leia = new Scanner (System.in);
		    
		    System.out.println("Entre com a primeira nota: ");
		    double nota1 = leia.nextDouble();
		    System.out.println("Entre com a nota 2 : ");
		    double nota2 = leia.nextDouble();
		    
		    double media = (nota1+nota2)/2;
		    
		    if(media>6){
		        System.out.println("Aluno aprovado, sua média é " + media);
		        
		    }else{
		        System.out.println("Aluno reprovado, sua média é : " + media);
		    
		    }
		
	}
}
