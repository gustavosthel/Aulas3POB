package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a nota (0 a 10): ");
        int nota = sc.nextInt();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else {
            switch (nota) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                case 7:
                    System.out.println("B");
                    break;
                case 6:
                case 5:
                    System.out.println("C");
                    break;
                case 4:
                case 3:
                    System.out.println("D");
                    break;
                case 2:
                case 1:
                case 0:
                    System.out.println("E");
                    break;
            }
        }
        
        sc.close();
	}

}
