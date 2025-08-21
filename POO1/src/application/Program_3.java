package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program_3 {

	public static void main(String[] args) {

		/**
		Exercício de fixação
		
		Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
		uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
		que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
		para ser responsável pelos cálculos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		
		double qtd = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.cotacao(price, qtd));
		
		sc.close();
	}

}
