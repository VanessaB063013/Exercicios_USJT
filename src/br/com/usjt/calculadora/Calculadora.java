package br.com.usjt.calculadora;

public class Calculadora {
	
	//Sobrecarga de métodos
	// o olhar é para os parâmetros
	
	public int soma(int a, int b) {
		
		int resultado;
		resultado = a+b;
		return resultado;
	}
	
	
	//alterando a tipagem
	public float soma(float a , float b) {
		return a+b;
		
		
	}
	

	public String soma (String a, String b) {
		//convertendo String para int
		Integer.parseInt(a);
		Integer.parseInt(b);
		return a+b;
	}
	
	// utilizando duas tipagens 
	public int soma (String a , int b) {
		
		return Integer.parseInt(a)+b;
		
		
	}
	
	
	// adicionando mais um parâmetro
	
	public int soma (int a, int b, int c) {
		return a+b+c;
		
	}
	
	public int subtracao(int a , int b) {
		int resultado;
		resultado = a-b;
		return resultado;
		
	}
	
	public int multiplicacao( int a , int b) {
		int resultado;
		resultado = a*b;
		return resultado;
		
	}
	
	public int divisao(int a, int b) {
		

		return a/b;
		
		
		
	}
	
	
	
	

}
