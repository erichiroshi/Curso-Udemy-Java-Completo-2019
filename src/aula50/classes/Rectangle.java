package aula50.classes;

import java.util.Scanner;

public class Rectangle {

	private double width;
	private double height;

	Scanner input = new Scanner(System.in);

	public Rectangle() {

		System.out.println("Enter rectangle width and height");
		width = input.nextDouble();
		height = input.nextDouble();

	}

	public double area() {

		return this.width * this.height;
	}

	public double perimeter() {

		return 2 * this.height + 2 * this.width;
	}

	public double diagonal() {

		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	@Override
	public String toString() {
		return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n",
				this.area(), this.perimeter(), this.diagonal());
	}
	
}
