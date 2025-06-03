package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números.");
        } finally {
            sc.close();
        }
    }
}


