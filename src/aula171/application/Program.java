package aula171.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula171.entities.Contract;
import aula171.entities.Installment;
import aula171.services.ContractService;
import aula171.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = input.nextInt();

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(input.next());

		System.out.print("Contract value: ");
		Double valueContract = input.nextDouble();

		System.out.print("Enter number of installments: ");
		int numParc = input.nextInt();

		Contract c1 = new Contract(number, date, valueContract);

		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(c1, numParc);

		System.out.println();
		System.out.println("Installments:");

		for (Installment list : c1.getInstallments()) {

			System.out.println(list.toString());
		}

		input.close();
	}

}
