package aula062;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int conta = input.nextInt();
		input.nextLine();

		System.out.print("Enter account holder: ");
		String nome = input.nextLine();

		Conta c1 = new Conta(nome, conta);

		System.out.print("Is there na initial deposit (y/n)?");
		char op = input.next().charAt(0);

		if (op == 'y') {

			System.out.print("Enter initial deposit value: ");
			c1.deposito(input.nextDouble());
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(c1);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		c1.deposito(input.nextDouble());
		System.out.printf("Updated account data:%n%s%n", c1);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		c1.saque(input.nextDouble());
		System.out.printf("Updated account data:%n%s%n", c1);

		input.close();
	}
}
