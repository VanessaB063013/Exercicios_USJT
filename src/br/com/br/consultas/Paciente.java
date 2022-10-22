package br.com.br.consultas;

public class Paciente {
	private String nome;
	private int idade;
	private String telefone;
	private String cpf;
	
	
	public void imprimirPaciente(String nome) {
		System.out.println("Paciente " + nome );
		}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	

}
