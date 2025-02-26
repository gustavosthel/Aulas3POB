package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double volume = (4/3) * 3.14159 * raio;
		
		System.out.print("Resultado: " + volume);
		
		sc.close();
	}

}
