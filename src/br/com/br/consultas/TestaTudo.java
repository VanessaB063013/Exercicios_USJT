package br.com.br.consultas;

import java.util.Scanner;

public class TestaTudo {
	/*- Crie o paciente João, que tem uma consulta com o médico Pedro no dia 22/10/2023
	- Crie a paciente Marcela, que tem uma consulta com o médico Rafael no dia 22/10/2023
	- Crie a paciente Regina, que tem uma consulta com a médica Carla no dia 22/10/2023

	- Se o paciente tiver menos de 14 nos, deve ser atendido pelo médico Pedro, que é pediatra*/
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		Medico med = new Medico();
		Medico med2 = new Medico();
		Medico med3 = new Medico();
		
		Paciente pac1 = new Paciente();
		Paciente pac2 = new Paciente();
		Paciente pac3 = new Paciente();
		
		Consulta date1 = new Consulta();
		Consulta date2 = new Consulta();
		Consulta date3 = new Consulta();
		
		
		
		int idadePaciente;
		String nomePaciente;
		
		
		System.out.println("Digite sua idade: " );
		idadePaciente = leia.nextInt();		
		System.out.println("Digite seu primeiro nome : ");
		nomePaciente = leia.next();
		
		if(idadePaciente<=14) {
			med.ImprimirMedico("Pedro");
			date1.ImprimirConsulta("22/10/2023");
			
			
			
			
		}else if(nomePaciente.equals("Marcela")) {
			med2.ImprimirMedico("Rafael");
			date1.ImprimirConsulta("22/10/2023");
			
			
		}else if(nomePaciente.equals("Regina")) {
			
			med3.ImprimirMedico("Carla");
			date1.ImprimirConsulta("22/10/2023");
			
		} else {
			System.out.println("Você não tem consulta marcada.");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
