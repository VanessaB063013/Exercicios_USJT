package br.com.ustj.lacorepeticaoexemplo;

public class ExercicioWhile {

	public static void main(String[] args) {
		// de 1 a 50 so par
		
		int contador = 1;
		while(contador <=50) {
			
			if(contador%2==0) {
			System.out.println("Os numeros pares são: " + contador);}
			contador++; 
	}

}
}