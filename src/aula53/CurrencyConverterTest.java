package aula53;

import java.util.Scanner;

public class CurrencyConverterTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = input.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double amount = input.nextDouble();

		System.out.printf("Amount to be paid in reais = R$ %,.2f", CurrencyConverter.dollarToReal(amount, dollarPrice));

		input.close();

	}
}
