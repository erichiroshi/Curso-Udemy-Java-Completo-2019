package aula162;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a folder path");
		String strPath = input.nextLine();

		File path = new File(strPath);

		System.out.println(path.getName());
		System.out.println(path.getParent());
		System.out.println(path.getPath());

		System.out.println();

		System.out.println("Arquivos na pasta: " + path.getName());
		System.out.println();

		File[] files = path.listFiles(File::isFile);

		for (File file : files) {
			System.out.println(file.getName());
		}

		System.out.println();
		System.out.println("Quantidade de arquivos: " + files.length);

		input.close();

	}

}
