package aula174;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		String filePath = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\aula 174.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String nome = br.readLine();

			while (nome != null) {

				String[] employee = nome.split(",");
				list.add(new Employee(employee[0], Double.parseDouble(employee[1])));
				nome = br.readLine();

			}

			Collections.sort(list);

			for (Employee n : list) {
				System.out.println(n.toString());
			}

		} catch (IOException e) {

			System.out.println("Erroc: " + e.getMessage());
		}

		String targetFilePath = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\aula 174 escrita.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {

			for (Employee n : list) {
				bw.write(n.toString());
				bw.newLine();
			}

		} catch (IOException e) {

			System.out.println("Error escrita: " + e.getMessage());
		}

	}
}
