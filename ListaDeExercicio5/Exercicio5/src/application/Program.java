package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		boolean continuar = true;
		
		System.out.print("Deseja adicionar um número? (S/N): ");
        String resposta = sc.nextLine().toLowerCase();

        if (!resposta.startsWith("s")) {
            continuar = false;
        }

        while (continuar) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            sc.nextLine(); 
            numeros.add(numero);

            System.out.print("Deseja adicionar outro número? (S/N): ");
            resposta = sc.nextLine().toLowerCase();

            if (!resposta.startsWith("s")) {
                continuar = false;
            }
        }

        Collections.sort(numeros);

        System.out.println("\nLista ordenada em ordem crescente:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

        sc.close();
	}

}
