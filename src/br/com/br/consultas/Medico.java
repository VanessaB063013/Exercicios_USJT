package br.com.br.consultas;

public class Medico {
	
	private String nome;
	private String crm;
	
	public void ImprimirMedico(String nome) {
		System.out.println("Você será atendido pelo médico : " + nome);
		}

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	
	
	
	
	
	
	
	
	
	

}
