package aula024;

import java.util.Scanner;

public class Aula24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite 3 números separados por espaço");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a >= b && a >= c)
			System.out.printf("Higher = %d", a);
		else if (b >= c && b >= a)
			System.out.println("Higher = " + b);
		else
			System.out.printf("Higher = %d", c);

		input.close();

	}
}
