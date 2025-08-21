package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program_1 {

	public static void main(String[] args) {
		
		/**
		 Problema exemplo
		 Fazerumprogramaparaler asmedidasdoslados dedoistriângulos XeY(suponha medidas
		 válidas). Emseguida,mostrarovalordasáreasdosdoistriângulosedizerqualdosdoistriângulos
		 possuiamaiorárea.
		 
		 A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a,b e c é 
		 a seguinte (fórmula de Heron):
		 
		 area = sqrt(p(p-a)(p-b)(p-c), onde p = (a+b+c)/2
		 
		 Valores para teste:
		 Enter the measures of triangle X:
			3.00
			4.00
			5.00
			Enter the measures of triangle Y:
			7.50
			4.50
			4.02
			Triangle X area: 6.0000
			Triangle Y area: 7.5638
			Larger area: Y
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
		 * SOLUÇÃO SEM USO DE CLASSE
		 */
		
		/*
		double xa,xb,xc,xp,ya,yb,yc,yp,areax,areay;
		
		System.out.println("Entre com valor dos lados do triangulo X:");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Entre com valor dos lados do triangulo Y:");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		xp = (xa+xb+xc)/2;
		areax = Math.sqrt(xp*(xp-xa)*(xp-xb)*(xp-xc));
		
		yp = (ya+yb+yc)/2;
		areay = Math.sqrt(yp*(yp-ya)*(yp-yb)*(yp-yc));
		
		System.out.printf("Área triangulo X: %.2f%n", areax);
		System.out.printf("Área triangulo Y: %.2f%n", areay);
		
		if(areax == areay) {
			System.out.println("X e Y tem a mesma área!");
		}
		else if(areax > areay) {
			System.out.println("Área de X é maior!");
		}
		else{
			System.out.println("Área de Y é maior!");
		}	
		*/	
		
		
		/**
		 * SOLUÇÃO COM USO DE CLASSE
		 */
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Entre com valor dos lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com valor dos lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Área triangulo X: %.2f%n", areax);
		System.out.printf("Área triangulo Y: %.2f%n", areay);
		
		if(areax == areay) {
			System.out.println("X e Y tem a mesma área!");
		}
		else if(areax > areay) {
			System.out.println("Área de X é maior!");
		}
		else{
			System.out.println("Área de Y é maior!");
		}	
		
		sc.close();
	}

}
