package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double num1 = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(num1, 2);
		
		System.out.print("Resultado: " + area);
		
		sc.close();
	}

}
