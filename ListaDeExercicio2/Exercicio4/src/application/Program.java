package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        
        if (ano % 4 != 0) {
            System.out.println("O ano não é bissexto.");
        } else if (ano % 100 != 0) {
            System.out.println("O ano é bissexto.");
        } else if (ano % 400 == 0) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        
        sc.close();

	}

}
