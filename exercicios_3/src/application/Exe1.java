package application;

import java.util.Scanner;
import entities.Retangulo;

public class Exe1 {

	public static void main(String[] args) {
		
		/**
		 Exercício 1
		 
		 Fazer um programa para ler os valores da largura e altura 
		 de um retângulo. Em seguida, mostrar na tela o valor de 
		 sua área, perímetro e diagonal. Usar uma classe como 
		 mostrado no projeto ao lado.
		 */

		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite largura e altura do retangulo:");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Área: %.2f%n", ret.area());
		System.out.printf("Perímetro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		
	}

}
