package aula167.model.services;

import aula167.model.entities.CarRental;
import aula167.model.entities.Invoice;
import aula167.model.entities.OnlinePaymentService;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private OnlinePaymentService taxService;

	public RentalService(Double pricePerDay, Double pricePerHora, OnlinePaymentService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHora;
		this.taxService = taxService;
	}

	public void processInovice(CarRental carRental) {

		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
