package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Digite um número inteiro maior que zero e menor que dez: ");
			n = sc.nextInt();
		} while (n <= 0 || n > 10);

		System.out.println("Criando vetor de " + n + " espaços.");
		double[] vect = new double[n];
		
		System.out.println();
		
		// Adiciona a quantidade de valores (n) ao vetor
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("--Números negativos--");
		// Busca no vetor os números negativos
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
