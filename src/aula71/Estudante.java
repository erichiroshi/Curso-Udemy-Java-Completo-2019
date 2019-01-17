package aula71;

public class Estudante {

	private String nome;
	private String email;
	
	public Estudante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return nome + ", " + email;
	}
	
	
	
	
	
}
