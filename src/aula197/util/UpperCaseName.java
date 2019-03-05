package aula197.util;

import java.util.function.Function;

import aula197.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {

		return p.getName().toUpperCase();
	}

}
