package aula201.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import aula201.entities.Product;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\in aula 201.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<Product>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();

			}

			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y)
					/ list.size();

			System.out.println("Average price: " + String.format("%.2f", avg));

			Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());

			List<String> name = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());

			name.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error na leitura: " + e.getMessage());
		}

	}

}
