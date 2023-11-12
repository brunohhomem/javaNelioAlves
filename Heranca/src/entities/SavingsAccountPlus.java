package entities;

public class SavingsAccountPlus extends SavingsAccount {

	
	// Sobrescrever o método da classe Account, sem descontar a taxa de saque.
	@Override
	public final void withdraw(double amount) {
		balance -= amount + 2; // Saque sem a taxa
	}
}
