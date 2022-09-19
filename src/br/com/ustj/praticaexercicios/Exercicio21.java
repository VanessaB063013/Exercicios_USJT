package br.com.ustj.praticaexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*)Um funcionário recebe um salário fixo acrescido de 4% de comissão sobre suas vendas. Faça um programa que recebe o salário fixo 
 * e a soma de tudo que ele vendeu, e mostre a comissão e o salário final do funcionário.*/
public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat(".##");
		
		System.out.println("Diga qual é o seu salário: ");
		double salario = leia.nextDouble();
		System.out.println("Entre com a quantidade de produtos vendidos: ");
		int vendidos = leia.nextInt();
		
		double comissao = (4.00/100.00)*salario;
		double vendas = vendidos*comissao;
		double salarioFinal = salario+vendas;
		
		System.out.println("Sua comissao de acordo com as suas vendas do mês é de R$" + vendas + " e o seu salário final é R$"+ salarioFinal);
		

	}

}
