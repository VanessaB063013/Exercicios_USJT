package br.com.usjt.teoricapoo;

public class Alunos {
	private String NomeAluno;
	private double nota1;
	private double nota2;
	private double nota3;
	private double notaFinal;
	
	
	public void  exibirMedia() {
		
	  notaFinal= nota1+nota2+nota3;
	  System.out.println("sua media foi: " + notaFinal);
	}
	
	public void exibirNota() {
		System.out.println("As suas notas foram: " + nota1 + " , " + nota2 + " , " + nota3);
		
		
	}
	
	public Alunos() {
		
	}


	public Alunos(String nomeAluno, double nota1, double nota2, double nota3, double notaFinal) {
		super();
		NomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.notaFinal = notaFinal;
	}

	
	
	public String getNomeAluno() {
		return NomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		NomeAluno = nomeAluno;
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}


	public double getNota3() {
		return nota3;
	}


	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	
	

}
