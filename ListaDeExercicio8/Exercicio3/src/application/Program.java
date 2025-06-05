package application;

import java.util.Scanner;

import interfac.DispositivoEletronico;
import model.Smartphone;
import model.Televisao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();
        
        while (true) {
            System.out.println("\nMenu de Dispositivos:");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisão");
            System.out.println("3 - Sair");
            System.out.print("Escolha um dispositivo: ");
            
            int escolhaDispositivo = sc.nextInt();
            
            if (escolhaDispositivo == 3) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            if (escolhaDispositivo < 1 || escolhaDispositivo > 2) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }
            
            System.out.println("\nAções disponíveis:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.print("Escolha uma ação: ");
            
            int escolhaAcao = sc.nextInt();
            
            DispositivoEletronico dispositivo = 
                (escolhaDispositivo == 1) ? smartphone : televisao;
            
            if (escolhaAcao == 1) {
                dispositivo.ligar();
            } else if (escolhaAcao == 2) {
                dispositivo.desligar();
            } else {
                System.out.println("Ação inválida!");
            }
        }
        
        sc.close();

	}

}
