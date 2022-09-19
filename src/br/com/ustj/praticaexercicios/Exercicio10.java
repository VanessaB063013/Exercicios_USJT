package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que exibe a área de um triângulo 
a partir da base e da altura fornecidas pelo usuário.*/
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        System.out.println("Entre com a altura do retângulo:  ");
        double altura = leia.nextDouble();
        System.out.println("Entre com a base do retângulo: ");
        double base = leia.nextDouble();
        
        double area = (base*altura);
        
        System.out.println("A area do retângulo é : " + area);
    

	}

}
