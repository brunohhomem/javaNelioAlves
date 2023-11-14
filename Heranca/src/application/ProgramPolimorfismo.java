package application;

import entities.Account;
import entities.SavingsAccount;

public class ProgramPolimorfismo {
	public static void main(String[] args) {

		// polimorfismo - muitas formas
		// mesma operação em variaveis do msm tipo, mas com comportamento diferentes
		// (devido aos objetos que elas referenciam)
		Account x = new Account(1020, "Ferdinand", 1000.0);
		Account y = new SavingsAccount(1023, "Oswald", 1000.0, 0.01);

		x.withdraw(50);
		y.withdraw(50);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}
}
