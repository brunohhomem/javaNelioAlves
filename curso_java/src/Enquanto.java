import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int soma = 0;

		while (x != 0) { // enquanto o x for diferente de zero
			soma += x;
			x = sc.nextInt();
		}

		System.out.println(soma);
		sc.close();
	}
}
