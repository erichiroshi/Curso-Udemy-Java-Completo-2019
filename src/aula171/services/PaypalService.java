package aula171.services;

import aula171.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {

		double valor = amount * (1 + 0.02);
		return valor;
	}

	@Override
	public Double interest(Double amount, int numParc) {

		double valor = amount * (1 + 1 * 0.01 * numParc);

		return paymentFee(valor);
	}

}
