package entities;

public class BusinessAccount extends Account {
	private double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance); // Super se refere a classe que empresta seus dados e comportamentos
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
//			deposit(amount); // chamando o metodo da classe account

			balance += amount - 10.0;
		}
	}
	
	// Sobrescrever o método da classe Account,aumentando o desconto do saque.
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
