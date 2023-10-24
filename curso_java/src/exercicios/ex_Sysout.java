package exercicios;

import java.util.Locale;

public class ex_Sysout {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Monitor";
		
		int age = 29;
		int code = 5732;
		char gender = 'M';
		
		double price1 = 2599.89;
		double price2 = 999.80;
		double measure = 53.77954233111;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f dolars%n",product1, price1);
		System.out.printf("%s, which price is $ %.2f dolars%n",product2, price2);
		System.out.println("Record: " + age + " years old, code: " + code + " and gender: " + gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places) :%.3f%n",measure);
		Locale.setDefault(Locale.US); // Altera a localização por padrão
		System.out.printf("US decimal point: %.3f%n",measure);
		
	}

}
