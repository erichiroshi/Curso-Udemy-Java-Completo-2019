package aula79;

import java.util.Scanner;

public class Matriz {

	private int[][] matriz;
	Scanner input = new Scanner(System.in);

	public Matriz(int m, int n) {

		this.matriz = new int[m][n];
	}

	public void lerMatriz() {

		System.out.println("Digite as linhas da matriz separadas por espaço");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = input.nextInt();
			}
		}

	}

	public void escreveMatriz() {

		System.out.println("MATRIZ:");

		for (int[] vetor : matriz) {
			for (int elemento : vetor) {
				System.out.printf("%-4d", elemento);
			}
			System.out.println();
		}

	}

	public void achaX(int x) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] == x) {
					System.out.printf("Position: %d,%d%n", i, j);
					if (j > 0) {
						System.out.printf("Left: %d%n", matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.printf("Right: %d%n", matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.printf("Up: %d%n", matriz[i - 1][j]);
					}
					if (i < matriz.length - 1)
						System.out.printf("Down: %d%n", matriz[i + 1][j]);
				}
			}
			System.out.println();
		}
	}

}
