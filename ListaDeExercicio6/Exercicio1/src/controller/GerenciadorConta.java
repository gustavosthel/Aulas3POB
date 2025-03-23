package controller;

import java.util.Locale;
import java.util.Scanner;

import model.ContaBancaria;

public class GerenciadorConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular(titular);
        
        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.print("Valor a depositar: ");
                    double valorDeposito = sc.nextDouble();
                    sc.nextLine(); 
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Valor a sacar: ");
                    double valorSaque = sc.nextDouble();
                    sc.nextLine(); 
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();        
	}

}
