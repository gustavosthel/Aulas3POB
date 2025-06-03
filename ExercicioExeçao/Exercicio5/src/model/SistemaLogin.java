package model;

import java.util.Scanner;

import Exepition.LoginInvalidoException;

public class SistemaLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite seu nome de usuário: ");
            String usuario = sc.nextLine();
            
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (usuario == null || usuario.trim().isEmpty() || 
                senha == null || senha.trim().isEmpty()) {
                
                throw new LoginInvalidoException("Erro: Usuário e senha não podem estar vazios!");
            }

            System.out.println("\nLogin realizado com sucesso! Bem-vindo, " + usuario + "!");

        } catch (LoginInvalidoException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Por favor, insira credenciais válidas.");
        } finally {
            sc.close();
        }
	}

}
