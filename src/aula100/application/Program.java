package aula100.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula100.entities.Client;
import aula100.entities.Order;
import aula100.entities.OrderItem;
import aula100.entities.Product;
import aula100.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String name = input.nextLine();

		System.out.print("Email: ");
		String email = input.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");

		Date birthDate = sdf.parse(input.nextLine());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data");
		System.out.print("Status: ");

		OrderStatus status = OrderStatus.valueOf(input.nextLine());
		Date moment = new Date();

		Order order = new Order(moment, status, client);

		System.out.print("How many items to this order? ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			input.nextLine();
			System.out.printf("Enter #%d item data:%n", i);
			System.out.print("Product name: ");
			name = input.nextLine();

			System.out.print("Product price: ");
			double price = input.nextDouble();

			Product product = new Product(name, price);

			System.out.print("Quantity: ");
			int quantity = input.nextInt();

			OrderItem item = new OrderItem(quantity, product);

			order.addItem(item);

		}

		System.out.println();
		System.out.println(order);

		input.close();
	}

}
