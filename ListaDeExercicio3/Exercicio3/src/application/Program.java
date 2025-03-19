package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para iniciar a contagem regressiva: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            do {
                System.out.println(numero);
                numero--;
            } while (numero >= 0);
        }

        sc.close();
	}

}


