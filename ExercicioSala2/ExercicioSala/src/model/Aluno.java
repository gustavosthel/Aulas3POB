package model;

public class Aluno {
	
	private int matricula;
    private String nome;
    private double coeficiente;
    
    public Aluno() {
    }
    
	public Aluno(int matricula, String nome, double coeficiente) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.coeficiente = coeficiente;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	public void mostraInfo() {
        System.out.println("Matrícula: " + matricula + ", Nome: " + nome + ", Coeficiente: " + coeficiente);
    }
}
