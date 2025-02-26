package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o base do triangulo: ");
		double base = sc.nextDouble();
		
		System.out.print("Digite o altura do triangulo: ");
		double altura= sc.nextDouble();
		
		double area = base * altura;
		
		double perimetro = 2 * (base + altura); 
	
		System.out.print("Area: " + area);
		System.out.print("Area: " + perimetro);
		
		sc.close();
	}

}
