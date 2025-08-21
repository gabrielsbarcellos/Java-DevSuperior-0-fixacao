package util;

public class CurrencyConverter {
	
	
	
	public static double cotacao(double price,double qtd) {
		
		return (price * qtd) + 0.06*(price * qtd);
	}

}
