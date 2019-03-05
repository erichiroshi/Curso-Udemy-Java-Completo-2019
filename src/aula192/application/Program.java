package aula192.application;

import java.util.ArrayList;
import java.util.List;

import aula192.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("NoteBook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));

		for (Product o : list)
			System.out.println(o);

	}

}
