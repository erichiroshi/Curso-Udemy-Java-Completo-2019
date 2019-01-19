package aula123.model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {

		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new IllegalArgumentException("The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new IllegalArgumentException("Not enough balance");
		} else {
			this.balance -= amount;
		}
	}

	public Double getBalance() {
		return balance;
	}
}
