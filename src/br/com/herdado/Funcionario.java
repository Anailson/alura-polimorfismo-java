package br.com.herdado;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public double getBonificacao() {

		return this.salario + 1000.0;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
