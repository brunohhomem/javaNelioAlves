import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);

		sc.close();
	}
	
	public static int max(int x,int y,int z) { //Função para descobrir qual o maior número, retorna valor
		int aux;

		if (x > y && y > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		};		
		
		return aux;		
	}	
	
	public static void showResult(int value) { //Função para imprimir o resultado, recebe o valor e imprime na tela, n retorna nada
		System.out.println("O maior número é: " + value);
	}
}
