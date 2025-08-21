package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaNotaFinal() {
		
		return nota1+nota2+nota3;
	}
	
	public void aprovado() {
		
		double nota = calculaNotaFinal();
		
		if(nota >= 60) {
			System.out.println("Aprovado");
		}
		else {
			double falta = 60 - nota;
			System.out.printf("Reprovado \n Faltam %.2f pontos.", falta);
		}
		
	}
}
