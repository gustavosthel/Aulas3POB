package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> numeros = new ArrayList<>();
		double numero;
		
		System.out.println("Digite números (digite -1 para parar):");

        while (true) {
            System.out.print("Número: ");
            numero = sc.nextDouble();

            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        double soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        double media = numeros.isEmpty() ? 0 : soma / numeros.size();

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        sc.close();
	}

}
