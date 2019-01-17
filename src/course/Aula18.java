package course;

import java.util.Locale;
import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your full name:");
		String fullName = input.nextLine();

		System.out.println("How many bedrooms are there in your house?");
		byte bedrooms = input.nextByte();

		System.out.println("Enter product price");
		double price = input.nextDouble();

		System.out.println("Enter your last name, age and height (same line)");
		String lastName = input.next();
		int age = input.nextInt();
		double height = input.nextDouble();

		System.out.println();
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);

		input.close();
	}
}
