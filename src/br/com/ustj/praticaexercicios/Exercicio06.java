package br.com.ustj.praticaexercicios;
//Faça um programa que lê o salário atual de alguém e exibe o novo salário 
//que é o atual com 25%de aumento.

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
	
	Scanner leia = new Scanner(System.in);
    
    System.out.println("Entre com o valor do seu salário: " );
    double salario = leia.nextDouble();
    
   double percentual =  25.00/100.00;
    double salarioFinal = salario + (percentual*salario);
    System.out.println("O novo salario é : " + salarioFinal);
	}
}
