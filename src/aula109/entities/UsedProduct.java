package aula109.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {

	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {

		return String.format("%s (used) $ %,.2f (Manufacture date: %s)", getName(), getPrice(),
				sdf.format(manufactureDate));
	}

}
