package aula071;

import java.util.Scanner;

public class AlojamentoPrincipal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Estudante[] alojamento = new Estudante[10];

		System.out.print("How many rooms will be rented? ");
		int quartosAlugados = input.nextInt();
		input.nextLine();

		for (int i = 0; i < quartosAlugados; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i + 1);

			System.out.print("Name: ");
			String nome = input.nextLine();

			System.out.print("Email: ");
			String email = input.nextLine();

			System.out.print("Room: ");
			int room = input.nextInt();
			input.nextLine();

			alojamento[room] = new Estudante(nome, email);

		}

		System.out.println();

		System.out.println("Busy rooms:");
		for (int i = 0; i < alojamento.length; i++) {

			if (alojamento[i] != null)
				System.out.printf("%d: %s%n", i, alojamento[i]);
		}

		input.close();
	}
}