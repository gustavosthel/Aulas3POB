package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();
        
        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos no intervalo:");

        for (int i = inicio; i <= fim; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false; 
                    break;
                }
            }

            if (primo && i > 1) {
                System.out.println(i);
            }
        }

        sc.close();
	}

}
