package br.com.ustj.praticaexercicios;

import java.util.Scanner;

//Faça um programa que recebe um número inteiro e 
//exibe uma mensagem indicando se ele é par ou ímpar
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        double num = leia.nextDouble();
        
        if(num%2==0){
            System.out.println("O número é par");
        
        } else{
            System.out.println("O número é ímpar");
        }

	}

}
