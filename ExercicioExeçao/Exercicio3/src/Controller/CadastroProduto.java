package Controller;

import java.util.Scanner;

import Exepition.PrecoInvalidoException;
import model.Produto;

public class CadastroProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("=== CADASTRO DE PRODUTO ===");
            
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();
            
            System.out.print("Preço (R$): ");
            double preco = sc.nextDouble();
            
            Produto produto = new Produto(nome, preco);
            System.out.println("\nProduto cadastrado com sucesso!");
            System.out.println(produto);
            
        } catch (PrecoInvalidoException e) {
            System.err.println("\nErro no cadastro: " + e.getMessage());
            System.err.println("Operação cancelada. Por favor, tente novamente com valores válidos.");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }

	}

}
