package aula161;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a folder path");
		String strPath = input.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(folder);
		}

		System.out.println();
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}

		System.out.println();

		boolean success = new File(strPath + "\\teste").mkdir();
		System.out.println("Directory created successfully: " + success);

		new File(strPath + "\\teste2").mkdir();

		input.close();
	}

}
