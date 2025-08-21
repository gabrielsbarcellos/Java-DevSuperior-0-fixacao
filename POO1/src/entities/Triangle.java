package entities;

public class Triangle {

	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p = p();
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
	}
	
	private double p() {
		
		double p = (a+b+c)/2;
		return p;
	}
	
}
