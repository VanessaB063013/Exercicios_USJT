package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*  Faça um programa que lê o salário base de alguém e exibe o novo salário, 
considerando 5% de gratificação(mais dinheiro)
e 7% de impostos(menos dinheiro)sobre o salário base. 
Também exiba a gratificação e o imposto.*/
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
        System.out.println("Entre com o salário: ");
        double salario = leia.nextDouble();
        
        double percentualGratificacao = 5.00/100.00;
        double percentualImposto = 7.00/100.00;
        
       
       double gratificacao = (percentualGratificacao*salario) ;
       double imposto = (percentualImposto * salario);
       
       System.out.println("O valor que vc receberá de gratificação é : " + gratificacao);
       System.out.println("O valor que você irá pagar de imposto é " + imposto);
        
        
      
       
       double salarioFinal = salario - imposto + gratificacao;
       System.out.println("O valor atual do seu salário é : " + salarioFinal);
    

	}

}
