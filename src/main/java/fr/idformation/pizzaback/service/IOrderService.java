package fr.idformation.pizzaback.service;

import java.util.List;

import fr.idformation.pizzaback.domain.Order;

public interface IOrderService {

	/**
	 * @return all known orders
	 */
	List<Order> getAll();

}
