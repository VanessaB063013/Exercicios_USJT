package br.com.usjt.calculadoracientifica;

public class CalculadoraCientifica {
	

	public double raiz(int a ) {
		
		Math.sqrt(a);
		System.out.println("A raiz quadrada é : " + a);
		
		return 	Math.sqrt(a);		
		
	}
	
	public double raiz(double a ) {
		
		Math.sqrt(a);
		System.out.println("A raiz quadrada é : " + a);
		
		return a;		
		
	}

	
	public double raiz(String a ) {
		
		
		System.out.println("A raiz quadrada é : " + a);
		
		return Math.sqrt(Double.parseDouble(a));	
		
	}
	
	
	
	public double potencia(byte a, byte b) {
		
		double result = Math.pow(a, b);
		System.out.println("Resultado da potenciação : " + result);
		
		return result;
	}
	
	
	public double potencia (String  a, String b) {
		
		Double.parseDouble(a);
		Double.parseDouble(b);
		
		double result = Math.pow(Double.parseDouble(a), Double.parseDouble(b));
		System.out.println("Resultado da potenciação : " + result);
		
		return result;
	}
	
	
	
}
