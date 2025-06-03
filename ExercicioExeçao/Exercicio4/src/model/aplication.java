package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        
        System.out.println("===== SIMULADOR DE LISTA DE TAREFAS =====");

        while (true) {
            exibirMenu();
            
            try {
                int opcao = sc.nextInt();
                sc.nextLine();  // Limpar o buffer
                
                switch (opcao) {
                    case 1:
                        adicionarTarefa(sc, tarefas);
                        break;
                    case 2:
                        removerTarefa(sc, tarefas);
                        break;
                    case 3:
                        exibirTarefas(tarefas);
                        break;
                    case 4:
                        System.out.println("\nSaindo do sistema... Até logo!");
                        sc.close();
                        return;
                    default:
                        System.out.println("\nErro: Opção inválida! Digite um número entre 1 e 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida! Digite apenas números para as opções.");
                sc.nextLine();  // Limpar entrada inválida
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n======== MENU PRINCIPAL ========");
        System.out.println("1 - Adicionar nova tarefa");
        System.out.println("2 - Remover tarefa por índice");
        System.out.println("3 - Exibir todas as tarefas");
        System.out.println("4 - Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarTarefa(Scanner scanner, ArrayList<String> tarefas) {
        System.out.print("\nDigite a nova tarefa: ");
        String novaTarefa = scanner.nextLine().trim();
        
        if (novaTarefa.isEmpty()) {
            System.out.println("Erro: Não é possível adicionar tarefa vazia!");
        } else {
            tarefas.add(novaTarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        }
    }

    private static void removerTarefa(Scanner scanner, ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("\nA lista de tarefas está vazia!");
            return;
        }
        
        exibirTarefas(tarefas);
        System.out.print("\nDigite o índice da tarefa a ser removida: ");
        
        try {
            int indice = scanner.nextInt();
            scanner.nextLine();  // Limpar buffer
            
            if (indice < 0 || indice >= tarefas.size()) {
                System.out.println("Erro: Índice inválido! Digite um número entre 0 e " + (tarefas.size() - 1));
            } else {
                String tarefaRemovida = tarefas.remove(indice);
                System.out.println("Tarefa removida: " + tarefaRemovida);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido! Digite apenas números inteiros.");
            scanner.nextLine();  // Limpar entrada inválida
        }
    }

    private static void exibirTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("\nA lista de tarefas está vazia!");
            return;
        }
        
        System.out.println("\n======== TAREFAS ========");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }

	}

}
