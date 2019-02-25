package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\in aula 189.txt";
		Map<String, Integer> votos = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String nome = fields[0];
				Integer voto = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome))
					voto += votos.get(nome);

				votos.put(nome, voto);
				line = br.readLine();
			}

			for (String c : votos.keySet()) {

				System.out.println(c + ": " + votos.get(c));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}