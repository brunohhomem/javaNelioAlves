import java.util.Scanner;

public class Ternaria {

	public static void main(String[] args) {
		// Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em
		// uma condição.

		Scanner sc = new Scanner(System.in);
		double preco;

		System.out.println("Digite o preço:");
		System.out.println("");

		preco = sc.nextDouble();

		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5; //Ternaria

		System.out.println("O desconto é: " + desconto);
		sc.close();

	}

}
