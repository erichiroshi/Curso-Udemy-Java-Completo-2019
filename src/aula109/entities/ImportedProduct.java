package aula109.entities;

public final class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double totalPrice() {

		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return String.format("%s $ %,.2f (Customs fee: $ %,.2f)", getName(), totalPrice(), customsFee);
	}

}
