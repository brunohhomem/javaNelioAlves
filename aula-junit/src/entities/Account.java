package entities;

public class Account {

	private static double DEPOSIT_FEE_PERCENTAGE = 0.02;

	private Long id;
	private Double balance;

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		if (amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}

	public void withdraw(Double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}

	public double fullWithdraw() {
		if (balance > 0) {
			double aux = balance;
			balance = 0.0;
			return aux;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
