package br.com.usjt.lacorepeticao;


import java.util.Scanner;

/*[while] Uma empresa está fazendo uma pesquisa, ligando para telespectadores e perguntando qual canal de televisão (4, 5 ou 9) 
 * eles estão assistindo. A cada ligação a resposta é registrada em um software e, no final do
dia, alguém digita zero e os canais com seus respectivos votos são exibidos em ordem decrescente. Construa esse software.
 Obs.: Considere que não haverá empate.*/
import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int canal;
		int canal1=0;
		int canal2=0;
		int canal3=0;
		boolean valido = true;
		
		while(valido==true) {
			valido=true;
			System.out.println("Entre com o canal (4,5 ou 9)");
			canal=leia.nextInt();
			
			if(canal == 4 && canal !=0) {
				valido=true;
				canal=canal1;
				canal1 = canal1 +1;
				
				
			} else if(canal==5 && canal !=0) {
				valido=true;
				canal=canal2;
				canal2 = canal2 +1;
				
			}else if(canal==9 && canal !=0) {
				valido=true;
				canal=canal3;
				canal3= canal3 +1 ;
				
			}else if(canal == 0) {
				valido=false;
				System.out.println();
				System.out.println("programa finalizado");
				System.out.println();
			}else {
				System.out.println("Opção inválida.");
			}
			
			
		}
			
		
		if(canal1>canal2 && canal1>canal3 && canal2>canal3) {
			
			System.out.println("Votos do canal 4: " + canal1);
			System.out.println("Votos do canal 5: " + canal2);
			System.out.println("Votos do canal 9: " + canal3);
			
		}else if(canal2> canal1 && canal2>canal3 && canal1>canal3){
		
			System.out.println("Votos do canal 5: " + canal2);
			System.out.println("Votos do canal 4: " + canal1);
			System.out.println("Votos do canal 9: " + canal3);
			
			
		}else if(canal3> canal2 && canal3>canal2 && canal2>canal1) {
			
			System.out.println("Votos do canal 9: " + canal3);
			System.out.println("Votos do canal 5: " + canal2);
			System.out.println("Votos do canal 4: " + canal1);
			
		}else if(canal3>canal2 && canal3>canal1 && canal1>canal2) {

			System.out.println("Votos do canal 9: " + canal3);
			System.out.println("Votos do canal 4: " + canal1);
			System.out.println("Votos do canal 5: " + canal2);
			
		}else if(canal1>canal3 && canal1>canal2 && canal3>canal2) {
			
			System.out.println("Votos do canal 4: " + canal1);
			System.out.println("Votos do canal 9: " + canal3);
			System.out.println("Votos do canal 5: " + canal2);
			
		}else if(canal2>canal3 && canal2>canal1 && canal3>canal1) {
		
			System.out.println("Votos do canal 5: " + canal2);
			System.out.println("Votos do canal 9: " + canal3);
			System.out.println("Votos do canal 4: " + canal1);
		}else {
			System.out.println("Empate entre canais.");
		}
			
		
	}

}
