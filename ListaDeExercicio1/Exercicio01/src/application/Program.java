package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int soma, num1, num2;
		
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite um numero: ");
		num2 = sc.nextInt();
		
		soma = num1+num2;
		
		System.out.println("A soma é: " + soma);
		
		sc.close();
		
	}

}
