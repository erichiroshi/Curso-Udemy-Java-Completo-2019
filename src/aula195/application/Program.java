package aula195.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import aula192.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Tablet", 350.50));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);

		for (Product prod : list)
			System.out.println(prod);

	}

}
