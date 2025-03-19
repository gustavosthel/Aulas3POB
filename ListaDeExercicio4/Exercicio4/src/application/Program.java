package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[8]; 
        int contadorPares = 0; 
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + contadorPares);

        sc.close();
	}

}
