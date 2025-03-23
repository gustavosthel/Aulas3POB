package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.print("Digite o número para verificar a contagem: ");
        int alvo = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == alvo) {
                contador++;
            }
        }

        System.out.println("O número " + alvo + " aparece " + contador + " vezes na lista.");

        sc.close();
	}

}
