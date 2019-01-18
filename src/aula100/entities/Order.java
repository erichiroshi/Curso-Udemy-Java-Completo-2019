package aula100.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aula100.entities.enums.OrderStatus;

public class Order {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {

		items.add(item);
	}

	public void removeItem(OrderItem item) {

		items.remove(item);
	}

	public double total() {

		double total = 0;
		for (OrderItem item : items) {

			total += item.subTotal();
		}

		return total;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items)
			sb.append(item + "\n");
		sb.append(String.format("Total price: $%,.2f", total()));

		return sb.toString();
	}

}
