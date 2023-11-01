//package application;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class SomaVetor {
//
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		double sum = 0;
//
//
//		do {
//			System.out.print("Digite um número inteiro maior que zero e menor que dez: ");
//			n = sc.nextInt();
//		} while (n <= 0 || n > 10);
//
//		System.out.println("Criando vetor de " + n + " espaços.");
//		double[] vect = new double[n];
//		
//		System.out.println();
//		
//		// Adiciona a quantidade de valores (n) ao vetor
//		for (int i = 0; i < vect.length; i++) {
//			System.out.print("Digite um número: ");
//			vect[i] = sc.nextDouble();
//		}
//		
////		System.out.println("--Valores--");
////		// Soma os valores do vetor
////		for (int i = 0; i < vect.length; i++) {
////			sum += vect[i];
////		}
////		
////		double avg = sum / n;
//		
//		System.out.println("Valores: " + vect.);
//		
//		sc.close();
//
//	}
//
//}
