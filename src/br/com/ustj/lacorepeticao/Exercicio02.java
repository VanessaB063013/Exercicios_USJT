package br.com.usjt.lacorepeticao;

/* [while] Um professor precisa saber qual a média das notas de uma sala e pediu sua ajuda para construir um 
 * programa que permita inserir as notas finais de cada aluno e, ao final, exibir a média da sala. 
 * Lembre-se que as notas variam de 0 a 10 e o professor digitará -1 quando quiser encerrar as entradas.*/
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double nota=0.0;
		double media = 0.0;
		int finalizar = 0;
		int cont =0;
		
		
	
		while(finalizar != -1) {
			System.out.println("Entre com a nota");
			nota= leia.nextDouble();
			if(nota<0 || nota >10.0) {
				System.out.println("Nota inválida");
				
			}
			
			else {
				System.out.println("Digite -1 quando desejar finalizar o programa ou qualquer numero para continuar");
				finalizar = leia.nextInt();
			
			cont ++;
			nota += nota + nota;
			media = nota/cont;
			}
		}
			
			
		System.out.println("Total de pontuação em notas : " + nota);
		System.out.println("media da sala :" + media);
		System.out.println("quantidade de notas : " + (cont));
		
		
	}
	
}
