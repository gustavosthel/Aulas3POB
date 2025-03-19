package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma dos " + n + " primeiros números naturais é: " + soma);

        sc.close();
	}

}
