package br.com.ustj.praticaexercicios;
/*Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário,
exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
• 6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• 4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
• 0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 = A1 (até 3 pontos) + A2 (até 3 pontos) + A3 (até 4 pontos)
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat(".##");
		System.out.println("Entre com a primeira nota de prova:");
		double a1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota de prova:");
		double a2 = leia.nextDouble();
		System.out.println("Entre com a primeira nota de trabalho:");
		double t1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota de trabalho:");
		double t2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota de trabalho:");
		double t3 = leia.nextDouble();

	
		double a3 = (t1+t2+t3)/3;
		double pontoMaxA1= (30.00/100.00)*10;
		double pontoMaxA2 =(30.00/100.00)*10;
		double pontoMaxA3 =(40.00/100.00)*10;
		
		double notaPeso1 = a1/pontoMaxA1;
		double notaPeso2 = a2 / pontoMaxA2;
		double notaPeso3 = a3/ pontoMaxA3;
		
		double media = (a1*pontoMaxA1)/10 + (a2*pontoMaxA2)/10 + (a3*pontoMaxA3)/10;
		
		
		if(media>=6 && media<=10) {
			System.out.println("Aluno aprovado!");
			System.out.println("Sua média foi: " + formatador.format(media));
		} else if(media>=4 && media<6) {
			System.out.println("Você não atingiu a média e deverá fazer o exame.");
			System.out.println("Sua média foi: " + formatador.format(media));
		} else if (media >=0 && media<4) {
			System.out.println("Aluno reprovado");
			System.out.println("Sua média foi: " + formatador.format(media));
		}
		
		
		
		
				
	}

}
