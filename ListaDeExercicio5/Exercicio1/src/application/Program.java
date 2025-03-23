package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		boolean continuar = true;
		
		System.out.print("Deseja inserir um número? (S/N): ");
        String resposta = sc.next().toLowerCase();

        if (!resposta.startsWith("s")) {
            continuar = false;
        }

        while (continuar) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            numeros.add(numero);

            System.out.print("Deseja continuar? (S/N): ");
            resposta = sc.next().toLowerCase();

            if (resposta.startsWith("n")) {
                continuar = false;
            }
        }

        System.out.println("Números digitados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
	}

}
