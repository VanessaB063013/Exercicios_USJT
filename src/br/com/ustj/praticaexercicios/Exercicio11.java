package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/*Faça um programa que exibe a área de um círculo
a partir do perímetro fornecido pelo usuário.*/

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        System.out.println("Entre com o perímetro do circulo: ");
        double perimetro = leia.nextDouble();
        
       double area = Math.PI*perimetro;
       
        System.out.println("A área do círculo é: " + area );

	}

}
