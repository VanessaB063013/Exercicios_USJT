package br.com.br.consultas;

public class Consulta {
	
	
	private String consulta;
	
	
	
	public void ImprimirConsulta (String data) {
		System.out.println(" Data : " + data);
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	
	
	public void imprimirData(String data) {
		System.out.println("Data da consulta : " + data);
		
		
	}
	
	

}
