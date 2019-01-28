package aula174;

public class Employee implements Comparable<Employee> {

	private String nome;
	private Double salary;

	public Employee(String nome, double salary) {
		this.nome = nome;
		this.salary = salary;
	}

	public String getNome() {
		return nome;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return -salary.compareTo(o.getSalary());
	}

	@Override
	public String toString() {
		return nome + "," + salary;
	}

}
