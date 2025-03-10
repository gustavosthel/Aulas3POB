package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = sc.next();
        
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        sc.close();

	}

}
