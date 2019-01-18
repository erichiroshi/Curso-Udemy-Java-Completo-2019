package aula079;

import java.util.Scanner;

public class MatrizTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz:");
		int m = input.nextInt();
		int n = input.nextInt();

		Matriz matriz = new Matriz(m, n);

		System.out.println();
		matriz.lerMatriz();

		System.out.println();
		matriz.escreveMatriz();

		System.out.println();
		System.out.println("Dígite o número x");
		int x = input.nextInt();

		System.out.println();
		matriz.achaX(x);

		input.close();

	}

}
