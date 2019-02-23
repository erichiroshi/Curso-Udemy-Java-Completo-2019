package aula186.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import aula186.entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\aula186.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> list = new HashSet<>();

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(" ");
				String name = fields[0];
				Date date = Date.from(Instant.parse(fields[1]));

				list.add(new LogEntry(name, date));

				line = br.readLine();

			}

			System.out.println("Total de users: " + list.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
