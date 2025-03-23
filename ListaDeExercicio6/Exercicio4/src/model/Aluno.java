package model;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno() {
	}

	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
    public boolean validarNota() {
        return nota >= 0 && nota <= 10;
    }
    
    public String classificarAluno() {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

}
