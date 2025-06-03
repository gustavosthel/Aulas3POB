package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class apliication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite cinco números inteiros:");

        for (int i = 0; i < 5; i++) {
            boolean entradaValida = false;
            
            while (!entradaValida) {
                try {
                    System.out.printf("Número %d: ", i + 1);
                    numeros[i] = sc.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Valor inválido. Digite um número inteiro.");
                    sc.next(); 
                }
            }
        }
        
        System.out.print("\nNúmeros digitados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        sc.close();

	}

}
