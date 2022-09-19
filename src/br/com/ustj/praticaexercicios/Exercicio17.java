package br.com.ustj.praticaexercicios;

import java.util.Scanner;

/* Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério:
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos);
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) e
• Máster (> 35 anos).*/
public class Exercicio17 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com sua idade: ");
		int idade = leia.nextInt();
		
		if(idade>=0 && idade<=10) {
			System.out.println("Categoria Infantil");
		}else if(idade>=11 && idade<=20) {
			System.out.println("Categoria Junior");
		} else if (idade>=15 && idade<=20) {
			System.out.println("Categoria adolescente");
		}else if(idade>=21 & idade<=35) {
			System.out.println("Categoria adulto");
		}else if (idade>35) {
			System.out.println("Categoria master");
		}else {
			System.out.println("Opção inválida");
		}
		

	}

}
