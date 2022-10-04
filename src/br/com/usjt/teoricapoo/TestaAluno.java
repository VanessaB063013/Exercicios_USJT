package br.com.usjt.teoricapoo;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		Alunos alunos = new Alunos();
	
		
		
		System.out.println("Diga seu nome:");
		String aluno = leia.next();
		System.out.println("Entre com a primeira nota :");
		double nota1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota :");
		double nota2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota :");
		double nota3 = leia.nextDouble();
		
		
		
		
		alunos.setNomeAluno(aluno);
		alunos.setNota1(nota1);
		alunos.setNota2(nota2);
		alunos.setNota3(nota3);
		alunos.getNotaFinal();
	
		
		alunos.exibirNota();
		alunos.exibirMedia();
	}

}
