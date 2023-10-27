package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex_Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("LARGURA");
		double largura = sc.nextDouble();
		System.out.println("COMPRIMENTO");
		double comprimento = sc.nextDouble();
		System.out.println("METRO QUADRADO");
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.println("");
		System.out.printf("Preco = R$%.2f%n", preco);

		sc.close();
	}
}
