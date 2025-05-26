package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;

public class ControllerAluno {

    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    // Construtor corrigido (sem void e com nome da classe)
    public ControllerAluno() {
        this.alunos = new ArrayList<>();
        carregarAlunos();
    }

    public void adicionarAluno(int matricula, String nome, double coeficiente) {
        Aluno aluno = new Aluno(matricula, nome, coeficiente);
        alunos.add(aluno);
        salvarAlunos();
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                aluno.mostraInfo();
            }
        }
    }

    public void alterarAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Novo nome do aluno: ");
            String novoNome = sc.nextLine();
            System.out.print("Novo coeficiente: ");
            double novoCoeficiente = sc.nextDouble();
            sc.nextLine(); // Limpar buffer

            aluno.setNome(novoNome);
            aluno.setCoeficiente(novoCoeficiente);
            salvarAlunos();
            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void excluirAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    private Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.getMatricula() + ";" + aluno.getNome() + ";" + aluno.getCoeficiente());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }

    private void carregarAlunos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int matricula = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double coeficiente = Double.parseDouble(dados[2]);
                alunos.add(new Aluno(matricula, nome, coeficiente));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de alunos não encontrado. Será criado ao salvar novos alunos.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar alunos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ControllerAluno controle = new ControllerAluno();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine(); // Corrige o buffer após nextInt()
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Coeficiente: ");
                    double coeficiente = sc.nextDouble();
                    sc.nextLine(); // Limpar buffer
                    controle.adicionarAluno(matricula, nome, coeficiente);
                    break;
                case 2:
                    controle.listarAlunos();
                    break;
                case 3:
                    System.out.print("Matrícula do aluno a alterar: ");
                    int matriculaAlterar = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    controle.alterarAluno(matriculaAlterar);
                    break;
                case 4:
                    System.out.print("Matrícula do aluno a excluir: ");
                    int matriculaExcluir = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    controle.excluirAluno(matriculaExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
