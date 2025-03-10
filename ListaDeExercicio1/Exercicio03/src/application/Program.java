package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus celsius: ");
		int num1 = sc.nextInt();
		
		double fahrenhit = (num1 * 9/5) + 32;
		
		System.out.print("Resultado: " + fahrenhit);
		sc.close();

	}

}
