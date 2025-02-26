package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a coordenada x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite a coordenada y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Digite a coordenada x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Digite a coordenada y2: ");
        double y2 = sc.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("A distância entre os pontos é: %.2f%n", distancia);
		
		sc.close();
	}

}
