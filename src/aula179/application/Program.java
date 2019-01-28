package aula179.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import aula179.entities.Product;
import aula179.service.CalculationService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\in aula 179.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();
			}

			Product p = CalculationService.max(list);

			System.out.println("Most expensive:");
			System.out.println(p);

		} catch (IOException e) {
			System.out.println("Erroc: " + e.getMessage());
		}
	}
}
