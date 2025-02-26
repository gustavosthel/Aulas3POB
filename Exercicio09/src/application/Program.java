package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em reais: ");
		double real = sc.nextDouble();
		
		double dolar = real * 5.77;
		
		System.out.print("Resultado: " + dolar);
	
		sc.close();

	}

}
