package aula195.util;

import java.util.function.Predicate;

import aula192.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice()>= 100;
	}

}
