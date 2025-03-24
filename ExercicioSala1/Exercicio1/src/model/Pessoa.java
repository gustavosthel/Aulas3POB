package model;

import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Double altura;
	private Double peso;
	private String sexo;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, Double altura, Double peso, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
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

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void listarPessoas(List<Pessoa> pessoa) {
		for (Pessoa x : pessoa) {
			System.out.print(x);
		}
	}
	
	public double calcularImc() {
		return (peso / (altura * altura));
	}
	
	public String classificarImc(double imc) {
		if (imc < 18.5) {
			return "Magreza";
		} else if (imc < 24.9) {
			return "Normal";
		} else if (imc < 29.9) {
			return "Sobrepeso";
		} else if (imc < 34.9) {
			return "Obesidade grau I";
		} else if (imc < 39.9) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III";
		} 
	}

	@Override
	public String toString() {
		return "Nome: " 
				+ nome 
				+ "\n"
				+ "Idade: " 
				+ idade
				+ "\n"
				+ "Altura: " 
				+ altura
				+ "\n"
				+ "Peso: " 
				+ peso
				+ "\n"
				+ "Sexo: " 
				+ sexo
				+ "\n";
	}

}
