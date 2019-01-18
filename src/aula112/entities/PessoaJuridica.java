package aula112.entities;

public class PessoaJuridica extends Pessoa {

	private int numFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {

		if (numFuncionarios > 10)

			return 0.14 * getRendaAnual();
		else
			return 0.16 * getRendaAnual();
	}

	@Override
	public String toString() {

		return String.format("%s: $ %.2f", getNome(), imposto());
	}

}
