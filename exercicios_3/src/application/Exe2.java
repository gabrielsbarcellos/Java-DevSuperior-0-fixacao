package application;

import java.util.Scanner;

import entities.Employee;

public class Exe2 {

	public static void main(String[] args) {

	/**
	  Exercício 2
	  
	  Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
	  seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
	  salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
	  afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
	  projetada abaixo.
	 */
		
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.println("Digite nome, salario bruto e imposto do funcionario:");
		func.name = sc.nextLine();
		func.grossSalary = sc.nextDouble();
		func.tax = sc.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.println();
		
		System.out.println("Digite porcentagem de aumento do salario:");
		double aux = sc.nextDouble();
		
		func.increaseSalary(aux);
		
		System.out.println(func.toString());
		
		
	}

}
