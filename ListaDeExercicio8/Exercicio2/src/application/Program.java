package application;

import java.util.Scanner;

import interfac.FormaGeometrica;
import model.Circulo;
import model.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a largura do retângulo:");
        double largura = sc.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = sc.nextDouble();
        
        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();
        
        FormaGeometrica retangulo = new Retangulo(largura, altura);
        FormaGeometrica circulo = new Circulo(raio);
        
        System.out.println("\nResultados para o Retângulo:");
        System.out.printf("Área: %.2f%n", retangulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", retangulo.calcularPerimetro());
        
        System.out.println("\nResultados para o Círculo:");
        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());
        
        sc.close();

	}

}
