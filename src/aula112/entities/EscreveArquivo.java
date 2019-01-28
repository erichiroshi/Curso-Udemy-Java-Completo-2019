package aula112.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class EscreveArquivo {

	public static void escreve(List<Pessoa> list, String file) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("TAXES PAID:");
			bw.newLine();

			double totalTaxas = 0;

			for (Pessoa lista : list) {

				bw.write(lista.toString());
				bw.newLine();
				totalTaxas += lista.imposto();
			}

			bw.newLine();
			bw.write("TOTAL TAXES: " + String.format("%.2f", totalTaxas));

		} catch (IOException e) {
			System.out.println("Error na escrita: " + e.getMessage());
		}

	}
}
