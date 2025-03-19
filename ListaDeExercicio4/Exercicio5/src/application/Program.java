package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[10]; 
        boolean encontrado = false; 
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.print("\nDigite um número para buscar: ");
        int numeroBuscado = sc.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        sc.close();
	}

}
