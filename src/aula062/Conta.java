package aula062;

public class Conta {

	private String nome;
	private final int conta;
	private double saldo;

	public Conta(String nome, int conta) {

		this.nome = nome;
		this.conta = conta;

	}

	public void deposito(double valor) {

		this.saldo += valor;
	}

	public void saque(double valor) {

		this.saldo -= (valor + 5);
	}

	public String toString() {

		return String.format("Account %d, Holder: %s, Balance: $ %,.2f", this.conta, this.nome, this.saldo);
	}

}
