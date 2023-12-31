import java.util.Locale; // Importa a classe Locale

public class Sysout {
	public static void main(String[] args) {
		System.out.print("Sem quebra de linha"); // Sem quebra de linha no final

		System.out.println("Com quebra de linha"); // Com quebra de linha no final
		
		Locale.setDefault(Locale.US); // Altera a localização por padrão (troca o , do br por . do ingles)
		
		System.out.printf("%.2f%n",100.56878924); // Mascára de formatação de duas casas decimais com quebra de linha (%n)
		
		System.out.printf("%.4f",100.56878924); // Mascára de formatação de quatro casas decimais

		System.out.println("Concatena elementos" + "Usando o println"); // Concatena com println
		
		double var = 10.555;
		
		System.out.printf("variavel 1 = %.2f%n", var); // Concatena com printf e quebra a linha
		
		String nome = "Bruno";
		int idade = 29;
		double renda = 9999.46548;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome, idade, renda); // Concatenando variaveis utilizando printf com marcação
	}
}
