package aula160;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\out.txt";
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			bw.newLine();
			
			for (String line : lines) {

				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
