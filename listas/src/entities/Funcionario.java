package entities;

public class Funcionario {

	private String nome;
	private int id;
	private double salario;
	
	// construtores
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int id, double salario) {

		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	// getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentaSalarioPercente(double percente) {

		this.salario += (this.salario*percente)/100;
	}
	
	public String toString(){
		
		return this.id+", "+this.nome+", "+this.salario;
	}
}
