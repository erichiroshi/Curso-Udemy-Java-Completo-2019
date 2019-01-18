package aula076;

public class Employee {

	private final Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {

		this.salary += this.salary * percentage/100;
	}

	public Integer getId() {
		return id;
	}

	public String toString() {

		return String.format("%d, %s, %,.2f", id, name, salary);
	}

}
