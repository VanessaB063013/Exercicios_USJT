package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que exibe a área de um retângulo a partir 
da base e da altura fornecidas pelo usuário.*/
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        System.out.println("Entre com a altura do triângulo:  ");
        double altura = leia.nextDouble();
        System.out.println("Entre com a base do triângulo: ");
        double base = leia.nextDouble();
        
        double area = (base*altura)/2;
        
        System.out.println("A area do triangulo é : " + area);
        

	}

}
