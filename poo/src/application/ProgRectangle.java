package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle widht and height");
		rectangle.w = sc.nextDouble();
		rectangle.h = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();

	}

}
