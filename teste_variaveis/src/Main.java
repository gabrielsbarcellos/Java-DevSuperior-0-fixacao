import java.util.Locale;

public class Main {

	public static void main(String[] args) {

/**
  	Exercício de fixação
  	Inicie as seguintes variáveis:
	String product1 = "Computer";
	String product2 = "Office desk";
	int age = 30;
	int code = 5290;
	char gender = 'F';
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567; 

	//Em seguida, usando os valores das variáveis, produza a 
	//seguinte saída na tela do console:
	
	Products:
	Computer, whichprice is $ 2100,00
	Office desk, whichpriceis $ 650,50
	
	Record: 30 years old, code 5290 andgender: F
	
	Measuewith eight decimal places: 53,23456700
	Rouded(threedecimal places): 53,235
	US decimal point: 53.235
 */
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n",product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n",product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",age, code,gender);
		
		System.out.printf("Measue with eight decimal places: %.8f\n",measure);
		System.out.printf("Rouded (three decimal places): %.3f\n",measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}
