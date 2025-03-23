package controller;

import java.util.Locale;
import java.util.Scanner;

import model.Aluno;

public class GerenciadorAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        
        double nota;
        Aluno aluno;
        
        while (true) {
            System.out.print("Digite a nota (0 a 10): ");
            nota = sc.nextDouble();
            sc.nextLine(); 
            
            aluno = new Aluno(nome, nota);
            
            if (aluno.validarNota()) {
                break; 
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        }
        
        System.out.println("\nResultado:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Classificação: " + aluno.classificarAluno());
        
        sc.close();
	}

}
