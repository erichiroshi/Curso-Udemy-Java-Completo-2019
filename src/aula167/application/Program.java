package aula167.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula167.model.entities.CarRental;
import aula167.model.entities.Vehicle;
import aula167.model.services.BrazilTaxService;
import aula167.model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = input.nextLine();

		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(input.nextLine());

		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(input.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = input.nextDouble();

		System.out.print("Enter price per day: ");
		double pricePerDay = input.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInovice(cr);

		System.out.println("INVOICE");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		input.close();
	}

}
