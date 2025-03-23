package controller;

import java.util.Locale;
import java.util.Scanner;

import model.Funcionario;

public class GerenciadorFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Consultar salário final");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Salário base (R$): ");
                    double salarioBase = sc.nextDouble();
                    sc.nextLine(); 
                    
                    System.out.print("Categoria (A/B/C): ");
                    String categoria = sc.nextLine().toUpperCase(); 
                    
                    funcionario = new Funcionario(nome, salarioBase, categoria);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    if (funcionario == null) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        double salarioFinal = funcionario.calcularSalarioFinal();
                        System.out.printf("Salário final de %s: R$ %.2f\n", 
                                         funcionario.getNome(), salarioFinal);
                    }
                    break;

                case 3:
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
