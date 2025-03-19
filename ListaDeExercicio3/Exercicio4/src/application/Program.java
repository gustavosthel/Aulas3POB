package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = sc.nextInt();

        double somaNotas = 0; 

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota; 
        }

        double media = somaNotas / quantidadeAlunos;

        System.out.println("A média da turma é: " + media);

        sc.close();
	}

}
