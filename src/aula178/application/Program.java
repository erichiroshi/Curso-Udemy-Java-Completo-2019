package aula178.application;

import java.util.Scanner;

import aula178.entities.PrintService;

public class Program {

	public static void main(String[] args) {

		PrintService<String> ps = new PrintService<>();
		Scanner input = new Scanner(System.in);

		System.out.print("How many values? ");
		Integer n = input.nextInt();

		for (int i = 0; i < n; i++) {
			ps.addValue(input.next());
		}

		ps.print();
		System.out.println("First: " + ps.first());

		input.close();

	}
}
