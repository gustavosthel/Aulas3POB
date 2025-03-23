package controller;

import java.util.Locale;
import java.util.Scanner;

import model.Elevador;

public class SimuladorElevador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos andares tem o prédio? ");
        int totalAndares = sc.nextInt();
        Elevador elevador = new Elevador();
        elevador.setTotalAndares(totalAndares);
        
        int opcao;
        do {
            System.out.println("\n=== Menu do Elevador ===");
            System.out.println("1 - Subir um andar");
            System.out.println("2 - Descer um andar");
            System.out.println("3 - Exibir andar atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 0:
                    System.out.println("Encerrando a simulação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        sc.close();
	}

}
