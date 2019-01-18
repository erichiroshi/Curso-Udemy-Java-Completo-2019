package aula109.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import aula109.entities.ImportedProduct;
import aula109.entities.Product;
import aula109.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input = new Scanner(System.in);
		List<Product> produtos = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.printf("Product #%d data:%n", i);
			System.out.print("Commom, used or imported (c/u/i)? ");
			char op = input.next().charAt(0);

			System.out.print("Name: ");
			String name = input.next();

			System.out.print("Price: ");
			double price = input.nextDouble();

			if (op == 'c') {

				produtos.add(new Product(name, price));
				
			} else if (op == 'u') {

				System.out.print("Manufacture date (DD/NN/YYYY): ");
				Date manufactureDate = sdf.parse(input.next());

				produtos.add(new UsedProduct(name, price, manufactureDate));
				
			} else if (op == 'i') {

				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();

				produtos.add(new ImportedProduct(name, price, customsFee));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS");
		for (Product p : produtos) {
			System.out.println(p.priceTag());
		}

		input.close();
	}

}
