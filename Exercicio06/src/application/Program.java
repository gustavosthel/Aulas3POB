package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();
        
        System.out.print("Digite a porcentagem de desconto do INSS: ");
        double porcentagemINSS = sc.nextDouble();
        
        double descontoINSS = salarioBruto * (porcentagemINSS / 100);
        
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
		
		sc.close();
		
		

	}

}
