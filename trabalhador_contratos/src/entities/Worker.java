package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import entities.enums.WorkerLevel;

public class Worker {

	
	private String name;
	private WorkerLevel level;
	private Double baseSalary; 
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * este metodo nao deve ser permitido pois as regras de
	 * negocio para editar contracts passam pelos metodos
	 * addContract e removeContract
	 * 
		public void setContracts(List<HourContract> contracts) {
			this.contracts = contracts;
		}
	*/

	public void addContract(HourContract contract) {
		
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		
		contracts.remove(contract);
	}
	
	/**
	 * a receber equivale ao salario base mais o
	 * tanto que o trabalhador ganhou de contratos 
	 * naquele mês
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public double income(int year, int month) {
		
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			
			// pegar o ano e o mes da data do contrato
			cal.setTime(c.getDate());
			int c_yer = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // +1 pq o mes no calendar começa com zero
			
			if(year == c_yer && month == c_month) {
				sum += c.totalValue();	
			}
		}
		return sum;
	}
	
}
