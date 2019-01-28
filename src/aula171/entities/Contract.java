package aula171.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double valueContract;

	private List<Installment> installments = new ArrayList<Installment>();

	public Contract(Integer number, Date date, Double valueContract) {
		this.number = number;
		this.date = date;
		this.valueContract = valueContract;
	}

	public Date getDate() {
		return date;
	}

	public Double getValueContract() {
		return valueContract;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(Installment installment) {
		installments.add(installment);
	}

}
