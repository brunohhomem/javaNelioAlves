package exemplos;

import java.util.Scanner;

public class ex_BitWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mask = 32;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("O sexto número é verdadeiro.");
		} else {
			System.out.println("O sexto número é falso.");
		}

		sc.close();

	}

}
