package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" }; // cria vetor com valores

		String path = "c:\\temp\\out.txt"; // indica o caminho do arquivo a ser criado

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line); // Escreve no arquivo
				bw.newLine(); // quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
