import java.util.Locale;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(2);

		System.out.println("Você digitou: " + x);
		System.out.println("O número inteiro é: " + y);
		System.out.println("O número real é: " + z);
		System.out.println("o caractere é: " + a);
		sc.close();
	}

}
