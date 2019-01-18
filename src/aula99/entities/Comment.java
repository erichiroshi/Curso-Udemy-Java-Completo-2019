package aula99.entities;

public class Comment {

	private String text;

	public Comment(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
