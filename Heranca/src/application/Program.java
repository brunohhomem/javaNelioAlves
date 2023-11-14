package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
//		Account acc1 = new Account(1001, "Alex", 1000.0); //Erro pq a classe account nao pode mais ser instanciada

		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1002, "Martha", 500.0, 0.01));
		list.add(new BusinessAccount(1003, "Anna", 1500.0, 400.0));
		list.add(new SavingsAccount(1004, "Clark", 100.0, 0.01));
		list.add(new BusinessAccount(1005, "D2", 150.0, 10.0));
		list.add(new SavingsAccount(1006, "Vampeta", 50.0, 0.02));
		list.add(new BusinessAccount(1007, "Ronaldo", 10000.0, 5000.0));

		double sum = 0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);
		System.out.println();

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		System.out.println();

		sum = 0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Updated total balance: %.2f%n", sum);

	}
}
