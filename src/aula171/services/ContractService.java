package aula171.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import aula171.entities.Contract;
import aula171.entities.Installment;

public class ContractService {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private OnlinePaymentService onlinePaymentService;
	private Calendar cal = Calendar.getInstance();

	public ContractService(OnlinePaymentService onlinePaymentService) {

		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer numParc) throws ParseException {

		for (int i = 1; i <= numParc; i++) {

			cal.setTime(contract.getDate());

			int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
			int mes = cal.get(GregorianCalendar.MONTH) + 1 + i;
			int ano = cal.get(GregorianCalendar.YEAR);

			String d = "" + dia + "/" + mes + "/" + ano;

			Date dueDate = sdf.parse(d);

			contract.setInstallments(
					new Installment(dueDate, onlinePaymentService.interest(contract.getValueContract() / numParc, i)));

		}
	}
}
