package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		double dias = idade * 365.3;
		
		System.out.print("Resulado: " + dias);
		sc.close();
	}

}
