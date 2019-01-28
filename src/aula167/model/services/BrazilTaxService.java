package aula167.model.services;

import aula167.model.entities.OnlinePaymentService;

public class BrazilTaxService implements OnlinePaymentService{

	public double tax(Double amount) {

		if (amount <= 100.0) {

			return amount * 0.2;
		} else {

			return amount * 0.15;
		}
	}
	
}
