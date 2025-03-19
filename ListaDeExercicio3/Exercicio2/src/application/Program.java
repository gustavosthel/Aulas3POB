package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        int contador = 1; 

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++; 
        }

        sc.close();
	}

}
