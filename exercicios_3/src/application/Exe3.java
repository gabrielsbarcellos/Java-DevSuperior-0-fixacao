package application;

import java.util.Scanner;


import java.util.Scanner;
import entities.Aluno;

public class Exe3 {

	public static void main(String[] args) {

		/**
		 Exercício 3
		 
		 Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
  		 (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		 ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
		 para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
		 resolver este problema.
		 */
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno e as 3 notas:");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Nota final = %.2f%n", aluno.calculaNotaFinal());
		
		aluno.aprovado();
	}
}
