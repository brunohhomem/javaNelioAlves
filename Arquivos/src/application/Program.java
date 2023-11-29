package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory); // traz as pastas do caminho especificado

		System.out.println("Folders:");

		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile); // traz os arquivos do caminho especificado
		System.out.println();
		System.out.println("Files: ");

		for (File file : files) {
			System.out.println(file);
		}

		System.out.println();
		boolean success = new File(strPath + "\\subdir").mkdir(); // criando uma subpasta no diretorio
		System.out.println("Directory created successfully: " + success);

		sc.close();
	}
}
