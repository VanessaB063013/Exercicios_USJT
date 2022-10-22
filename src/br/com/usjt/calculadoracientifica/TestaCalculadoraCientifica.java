package br.com.usjt.calculadoracientifica;

import java.util.Scanner;

public class TestaCalculadoraCientifica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		CalculadoraCientifica  calc = new CalculadoraCientifica();
		
		String	num1;
		String num2;
		byte num3;
		byte num4;
		int num5;
		double num6;
		String num7;
		
		
		System.out.println("Entre com um valor inteiro para saber a raíz: ");
		num5 = leia.nextInt();
		
		System.out.println("Entre com um valor inteiro para saber a raíz: ");
		num6 = leia.nextDouble();
		
		
		
		System.out.println("Entre com um valor inteiro para saber a raíz: ");
		num7 = leia.next();
		
		
		
		
		System.out.println("Ente com os valores a (base) e b (expoente) : ");
		num1 = leia.next();
		num2 = leia.next();
		
		System.out.println("Ente com os valores a (base) e b (expoente) : ");
		num3 = leia.nextByte();
		num4 = leia.nextByte();
		
		calc.potencia(num1, num2);
		calc.potencia(num3, num4);
		calc.raiz(num5);
		calc.raiz(num6);
		calc.raiz(num7);
		
	}

}
