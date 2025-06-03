package model;

import Exepition.PrecoInvalidoException;

public class Produto {

	private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        setNome(nome);
        setPreco(preco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço inválido: R$" + preco + ". O valor deve ser maior que zero.");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: R$%.2f", nome, preco);
    }

}
