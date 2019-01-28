package aula157;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\erich\\OneDrive\\Área de Trabalho\\Udemy\\Java curso completo\\arquivos aulas\\in.txt");
		Scanner input = null;

		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}

		}
	}
}
