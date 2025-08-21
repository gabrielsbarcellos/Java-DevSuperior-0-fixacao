package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		product.name = sc.nextLine(); 
		System.out.print("Price:");
		product.price = sc.nextDouble();
		System.out.print("Quantity:");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be add in stock: ");
		int qtd = sc.nextInt();
		product.addProducts(qtd);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		System.out.println();
	
		System.out.print("Enter the number of products to be removed from stock: ");
		qtd = sc.nextInt();
		product.removeProducts(qtd);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		System.out.println();
		
		sc.close();
	}

}
