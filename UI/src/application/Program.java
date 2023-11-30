package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("*Welcome to Car Super-Lux Rent*");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("Enter rent data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Withdraw (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.println();
		System.out.println("PRICES:");
		System.out.print("Price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("INVOICE: ");
		System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Brazilian Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Full Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		System.out.println("--------------------------------");
		System.out.println();

		sc.close();

	}

}
