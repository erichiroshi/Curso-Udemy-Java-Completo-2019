package aula167.model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental(Date start, Date finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setInvoice(Invoice invoice) {
		
		this.invoice = invoice;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	
	
}
