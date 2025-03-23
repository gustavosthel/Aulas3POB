package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.print("Informe o nome a ser removido: ");
        String nomeRemover = sc.nextLine();

        if (nomes.remove(nomeRemover)) {
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("O nome '" + nomeRemover + "' não existe na lista.");
        }

        System.out.println("Lista após remoção:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
	}

}
