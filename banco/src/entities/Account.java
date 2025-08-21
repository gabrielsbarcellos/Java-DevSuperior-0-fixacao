package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;

	// constructors
	public Account() {

	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// getters and setters
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// others methods
	
	public void deposit(double value) {
		
		balance += value;
	}
	
	public void withdraw(double value) {
		
		if(value > 0) {
			value += 5;
			balance -= value;
		}
		else {
			System.out.println("Erro");
		}
	}
	
	public String toString() {
		
		String txt = "";

		txt += "Account: " + getNumber() +
			   ", Holder: " + getHolder() +
			   ", Balance: $" + String.format("%.2f",getBalance());
		return txt;
	}
}
