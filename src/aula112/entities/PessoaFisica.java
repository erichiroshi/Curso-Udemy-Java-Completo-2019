package aula112.entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {

		if (getRendaAnual() < 20000.00)
			return 0.15 * getRendaAnual() - (gastoSaude * .5);
		else
			return 0.25 * getRendaAnual() - (gastoSaude * .5);
	}

	@Override
	public String toString() {

		return String.format("%s: $ %.2f", getNome(), imposto());
	}

}
