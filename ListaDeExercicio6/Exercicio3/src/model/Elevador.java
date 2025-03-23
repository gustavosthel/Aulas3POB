package model;

public class Elevador {
	private int andarAtual;
    private int totalAndares;
    
    public Elevador() {
    }

	public Elevador(int andarAtual, int totalAndares) {
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
    
	public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual);
        } else {
            System.out.println("Você já está no último andar!");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual);
        } else {
            System.out.println("Você já está no térreo!");
        }
    }

    public void exibirAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}
