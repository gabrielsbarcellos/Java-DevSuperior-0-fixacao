import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ler uma palavra
		String x;
		
		System.out.println("Digite texto:");
		x = sc.next(); // para o programa e aguarda o user digitar algo
		System.out.println("Voce digitou: " + x);

		// lert inteiro
		int y;
		System.out.println("Digite int:");
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);

		// lert float xxx,xx
		double z;
		System.out.println("Digite float ',':");
		z = sc.nextDouble(); // para o programa e aguarda digitar um numero
		// float no padrão do computador (br = ,)
		System.out.printf("Voce digitou: %.2f\n", z);
		
		
		// lert float xxx.xx
		Locale.setDefault(Locale.US);
		Scanner sc2 = new Scanner(System.in);
		double t;
		System.out.println("Digite float '.':");
		t = sc2.nextDouble(); // para o programa e aguarda digitar um numero
		// float no padrão usa. (usa = .) 
		
		System.out.printf("Voce digitou: %.2f\n", t);
		
		// ler char
		System.out.println("Digite char");
		char w;
		
		sc.nextLine(); // scanner flush
		w = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + w);

		System.out.println("Digite texto grande 3x:");
		// ler entrada até quebra de linha (apertar enter)
		sc.nextLine(); // scanner flush
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// ler varios tipos na mesma linha
		System.out.println("Digite text int double:");
		String x1;
		int x2;
		double x3;
		
		x1 = sc.next();
		x2 = sc.nextInt();
		x3 = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		sc.close();
		sc2.close();
	}

}
