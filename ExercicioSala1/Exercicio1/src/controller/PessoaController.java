package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Pessoa;

public class PessoaController {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Voce quer salvar quantas pessoas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Pessoa #" + (i + 1) + ":");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			Double altura = sc.nextDouble();
			
			System.out.print("Peso: ");
			Double peso = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("Sexo (M/F): ");
			String sexo = sc.nextLine();
			
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			pessoa.setAltura(altura);
			pessoa.setPeso(peso);
			pessoa.setSexo(sexo);
			
			lista.add(pessoa);
		}
		System.out.println();
		System.out.println("Lista de Pessoas");
		pessoa.listarPessoas(lista);
		
		sc.close();
	}
}
