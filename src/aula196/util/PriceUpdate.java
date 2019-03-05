package aula196.util;

import java.util.function.Consumer;

import aula192.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {

		p.setPrice(p.getPrice()+p.getPrice()*0.1);
		
	}

}
