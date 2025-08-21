package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Exercicio {

	public static void main(String[] args) {
		
		/***
		Exercício de fixação
		
		Fazer um programa para ler um número inteiro N e depois os dados(id,nome e salario) de
		N funcionários. Não deve haver repetição de id.
		Em seguida, efetuar o aumento de X porcento no salário de um determinado funcionário.
		Para isso, o programa deve ler um id e o valor X. Se oi d informado não existir,mostrar uma
		mensagem e abortar a operação. Ao final,mostrar a listagem atualizada dos funcionários,
		conforme exemplos.
		Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
		aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas pessoas serão registradas?");
		n = sc.nextInt();
		
		List<Funcionario> list= new ArrayList<>();
		
		String nome;
		int id;
		double salario;
		
		for(int i=0;i<n;i++) {
			
			System.out.println();
			System.out.println("Empregado #"+(i+1));
			System.out.print("ID: ");
			
			id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("ID já utilizado, tente outro! ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			
			nome = sc.nextLine();
			
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			
			Funcionario f = new Funcionario(nome,id,salario);
			
			list.add(f);
		}
		
		System.out.println();
		System.out.print("Digite o ID do funcionário que terá novo salario: ");
		int new_id = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == new_id).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("Funcionário não existe!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			func.aumentaSalarioPercente(percentage);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario obj : list) {
			System.out.println(obj.toString());
		}
		
		sc.close();

	}

	private static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
