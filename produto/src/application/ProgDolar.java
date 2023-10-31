package application;

import java.util.Locale;
import java.util.Scanner;

import util.Moeda;

public class ProgDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Moeda moeda = new Moeda();
		
		System.out.print("What is the dollar price?: ");
		moeda.dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		moeda.quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais =  %.2f%n", moeda.reais());
		
		
		sc.close();

	}

}
