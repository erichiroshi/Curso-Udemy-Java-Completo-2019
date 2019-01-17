package aula76;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("Id: ");
			int id = input.nextInt();
			input.nextLine();

			System.out.print("Name: ");
			String name = input.nextLine();

			System.out.print("Salary: ");
			double salary = input.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = input.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee empe : list)
			System.out.println(empe);

		input.close();

		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.print("How many employees will be registered? "); Employee[]
		 * employee = new Employee[input.nextInt()];
		 * 
		 * for (int i = 0; i < employee.length; i++) {
		 * 
		 * System.out.println(); System.out.printf("Employee #%d:%n", i + 1);
		 * System.out.print("Id: "); int id = input.nextInt(); input.nextLine();
		 * 
		 * System.out.print("Name: "); String name = input.nextLine();
		 * 
		 * System.out.print("Salary: "); double salary = input.nextDouble();
		 * 
		 * employee[i] = new Employee(id, name, salary);
		 * 
		 * }
		 * 
		 * System.out.println();
		 * System.out.print("Enter the employee id that will have salary increase: ");
		 * int id = input.nextInt();
		 * 
		 * for (Employee emp : employee) { if (emp.getId().equals(id)) {
		 * 
		 * System.out.println("Enter the percentage");
		 * emp.increaseSalary(input.nextDouble()); }
		 * 
		 * }
		 * 
		 * int i = 0; for (Employee emp : employee) {
		 * 
		 * if (emp.getId().equals(id)) i++; }
		 * 
		 * if (i == 0) System.out.println("This id does not exist!");
		 * 
		 * System.out.println(); System.out.println("List of employees:"); for (Employee
		 * emp : employee) System.out.println(emp);
		 * 
		 * input.close();
		 */
	}

}
