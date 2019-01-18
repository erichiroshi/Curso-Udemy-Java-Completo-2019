package aula112.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula112.entities.Pessoa;
import aula112.entities.PessoaFisica;
import aula112.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = input.next().charAt(0);

			System.out.print("Name: ");
			String nome = input.next();

			System.out.print("Anual income: ");
			double rendaAnual = input.nextDouble();

			if (op == 'i') {

				System.out.print("Health expenditures: ");
				double gastoSaude = input.nextDouble();

				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));

			} else {

				System.out.print("Number of employees: ");
				int numFuncionarios = input.nextInt();

				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");

		double totalTaxas = 0;
		for (Pessoa lista : list) {

			System.out.println(lista);
			totalTaxas += lista.imposto();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", totalTaxas));

		input.close();
	}
}
