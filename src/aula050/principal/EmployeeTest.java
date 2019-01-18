package aula050.principal;

import java.util.Scanner;

import aula050.classes.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Employee e1 = new Employee();

		System.out.printf("Employee: %s", e1.toString());

		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		double percentage = input.nextDouble();

		e1.increaseSalary(percentage);

		System.out.println();
		
		System.out.printf("Updated data: %s", e1);

		input.close();
	}

}
