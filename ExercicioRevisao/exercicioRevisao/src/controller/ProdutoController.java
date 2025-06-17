package controller;

import java.util.ArrayList;

import model.Produto;

public class ProdutoController {
	
	private ArrayList<Produto> produtos = new ArrayList<>();
    private int ultimoId = 0;

    public void criarProduto(String nome, int quantidade) {
        ultimoId++;
        produtos.add(new Produto(ultimoId, nome, quantidade));
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean atualizarProduto(int id, String novoNome, int novaQuantidade) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setQuantidade(novaQuantidade);
            return true;
        }
        return false;
    }

    public boolean excluirProduto(int id) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }

}
