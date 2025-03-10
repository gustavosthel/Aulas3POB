package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.print("Resutado: " + media);
		sc.close();

	}

}
