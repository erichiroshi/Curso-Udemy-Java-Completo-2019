package aula163.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula163.entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Produto> list = new ArrayList<Produto>();

		System.out.println("Enter file path: ");
		String sourceFileStr = input.nextLine();

		File sourceFile = new File(sourceFileStr);

		new File(sourceFile.getParent() + "\\out").mkdir();

		String targetFileStr = sourceFile.getParent() + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String line = br.readLine();

			while (line != null) {

				String[] lines = line.split(",");

				String name = lines[0];
				double price = Double.parseDouble(lines[1]);
				int qnt = Integer.parseInt(lines[2]);

				list.add(new Produto(name, price, qnt));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Produto item : list) {

					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		input.close();
	}
}
