package aula123.application;

import java.util.Scanner;

import aula123.model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.print("Number: ");
		int number = input.nextInt();
		input.nextLine();

		System.out.print("Holder: ");
		String holder = input.nextLine();

		System.out.print("Initial balance: ");
		double balance = input.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = input.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = input.nextDouble();

		try {

			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (IllegalArgumentException e) {

			System.out.println("Withdraw error: " + e.getMessage());
		}

		input.close();

	}
}
