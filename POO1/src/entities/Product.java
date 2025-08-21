package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	/**
	 * metodo construtor padrao
	 */
	
	public Product() {
		
	}
	
	
	/**
	 * metodo construtor completo
	 * @return
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/**
	 * Sobrescrita no metodo construtor, sem o 
	 * parametro quantity
	 * @return
	 */
	public Product(String name, double price) {

		this.name = name;
		this.price = price;
	}
	
	
	
	/**
	 * Nota, não tem um setQuantity pois quem faz
	 * este moviemtno é a função addProducts e
	 * removeProducts
	 * 
	 * @return
	 */
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		
		String txt = "";
		
		txt += "Name: "+name+", ";
		txt += "Price: $ "+String.format("%.2f", price)+", ";
		txt += "Quantity: "+quantity+", ";
		txt += "Total: " + String.format("%.2f", totalValueInStock());
		
		return txt;
	}
}
