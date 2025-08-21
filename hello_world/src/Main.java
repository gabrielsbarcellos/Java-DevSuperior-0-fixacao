import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int y = 32;
		double x = 3232.455452;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // quebra de linha com %n
		System.out.printf("%.2f\n", x); // quebra de linha com \n
		System.out.printf("%.4f%n", x);
		
		// o printf vai pegar o separador decimal do
		// idioma padrão do computador. Para setar o
		// padrão manualmente faça
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		// concatenar
		//el1 + el2 + el3 + ...
		
		System.out.println("Resultado = "+ x + " metros.");
		System.out.printf("Resultado = %.2f metros.%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
