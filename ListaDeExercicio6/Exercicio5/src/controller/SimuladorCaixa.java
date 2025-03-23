package controller;

import java.util.Locale;
import java.util.Scanner;

import model.CaixaEletronico;

public class SimuladorCaixa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CaixaEletronico caixa = new CaixaEletronico(); 
        
        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== Menu do Caixa Eletrônico ===");
            System.out.println("1 - Realizar saque");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do saque (múltiplo de 10): ");
                    double valor = sc.nextDouble();
                    sc.nextLine(); 
                    caixa.sacar(valor);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
	}

}
