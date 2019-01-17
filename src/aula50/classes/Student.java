package aula50.classes;

import java.util.Scanner;

public class Student {

	private String name;
	private double n1, n2, n3;

	Scanner input = new Scanner(System.in);

	public Student() {

		System.out.println("Digite o nome do aluno:");
		this.name = input.nextLine();

		System.out.println("Digite as 3 notas do aluno:");
		this.n1 = input.nextDouble();
		this.n2 = input.nextDouble();
		this.n3 = input.nextDouble();
	}

	private double notaFinal() {

		return this.n1 + this.n2 + this.n3;
	}

	@Override
	public String toString() {

		return String.format("Aluno: %s%nFINAL GRADE = %.2f%n%s", this.name, this.notaFinal(),
				(this.notaFinal() >= 60 ? "PASS"
						: String.format("FAILED%nMISSING %.2f POINTS", 60 - this.notaFinal())));
	}

}