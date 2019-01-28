package aula189.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<String, Integer> votos = new HashMap<>();

		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\in aula 189.txt";
		String targetPath = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\out aula 189.txt";

		// System.out.println("Enter file full path: ");
		// String path = input.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String nome = fields[0];
				Integer voto = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome)) {
					voto += votos.get(nome);
				}

				votos.put(nome, voto);
				line = br.readLine();
			}

			for (String key : votos.keySet())
				System.out.println(key + ": " + votos.get(key));

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))) {

				bw.write("Total de votos:\n");
				for (String key : votos.keySet()) {
					bw.write(key + ": " + votos.get(key) + "\n");
				}

			} catch (IOException e) {
				System.out.println("Error na escrita: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error na leitura: " + e.getMessage());
		}

		input.close();
	}
}
