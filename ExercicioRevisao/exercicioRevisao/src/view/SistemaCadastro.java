package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;

public class SistemaCadastro {
	
	private static Scanner scanner = new Scanner(System.in);
    private static ProdutoController controller = new ProdutoController();

	public static void main(String[] args) {
		
	        while (true) {
	            System.out.println("\n--- CADASTRO DE PRODUTOS ---");
	            System.out.println("1. Cadastrar novo produto");
	            System.out.println("2. Listar produtos");
	            System.out.println("3. Buscar produto");
	            System.out.println("4. Atualizar produto");
	            System.out.println("5. Excluir produto");
	            System.out.println("0. Sair");
	            System.out.print("Opção: ");

	            int opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    cadastrarProduto();
	                    break;
	                case 2:
	                    listarProdutos();
	                    break;
	                case 3:
	                    buscarProduto();
	                    break;
	                case 4:
	                    atualizarProduto();
	                    break;
	                case 5:
	                    excluirProduto();
	                    break;
	                case 0:
	                    System.out.println("Saindo do sistema...");
	                    System.exit(0);
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }
	    }

	    private static void cadastrarProduto() {
	        System.out.print("Nome do produto: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Quantidade: ");
	        int quantidade = scanner.nextInt();
	        
	        controller.criarProduto(nome, quantidade);
	        System.out.println("Produto cadastrado com sucesso!");
	    }

	    private static void listarProdutos() {
	        ArrayList<Produto> produtos = controller.listarProdutos();
	        
	        if (produtos.isEmpty()) {
	            System.out.println("Nenhum produto cadastrado!");
	            return;
	        }

	        System.out.println("\nLISTA DE PRODUTOS:");
	        for (Produto produto : produtos) {
	            System.out.println(
	                "ID: " + produto.getId() + " | " +
	                "Nome: " + produto.getNome() + " | " +
	                "Quantidade: " + produto.getQuantidade()
	            );
	        }
	    }

	    private static void buscarProduto() {
	        System.out.print("Digite o ID do produto: ");
	        int id = scanner.nextInt();
	        
	        Produto produto = controller.buscarProduto(id);
	        if (produto != null) {
	            System.out.println("\nPRODUTO ENCONTRADO:");
	            System.out.println("ID: " + produto.getId());
	            System.out.println("Nome: " + produto.getNome());
	            System.out.println("Quantidade: " + produto.getQuantidade());
	        } else {
	            System.out.println("Produto não encontrado!");
	        }
	    }

	    private static void atualizarProduto() {
	        System.out.print("Digite o ID do produto: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();  
	        
	        System.out.print("Novo nome: ");
	        String novoNome = scanner.nextLine();
	        
	        System.out.print("Nova quantidade: ");
	        int novaQuantidade = scanner.nextInt();
	        
	        if (controller.atualizarProduto(id, novoNome, novaQuantidade)) {
	            System.out.println("Produto atualizado com sucesso!");
	        } else {
	            System.out.println("Produto não encontrado!");
	        }
	    }

	    private static void excluirProduto() {
	        System.out.print("Digite o ID do produto: ");
	        int id = scanner.nextInt();
	        
	        if (controller.excluirProduto(id)) {
	            System.out.println("Produto excluído com sucesso!");
	        } else {
	            System.out.println("Produto não encontrado!");
	        }
	    }

}


