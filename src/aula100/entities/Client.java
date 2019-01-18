package aula100.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(name + " (");
		sb.append(sdf.format(birthDate) + ") - ");
		sb.append(email);

		return sb.toString();
	}

}
