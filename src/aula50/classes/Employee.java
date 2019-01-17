package aula50.classes;

import java.util.Scanner;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;

	Scanner input = new Scanner(System.in);

	public Employee() {

		System.out.println("Digite o nome:");
		this.name = input.nextLine();

		System.out.println("Digite o sálario:");
		this.grossSalary = input.nextDouble();

		System.out.println("Digite a taxa:");
		this.tax = input.nextDouble();
		System.out.println();

	}

	public double netSalary() {

		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {

		this.grossSalary += this.grossSalary * (percentage/100);

	}

	public String toString() {

		return String.format("%s, $ %.2f%n", this.name, this.netSalary());
	}
	
}
