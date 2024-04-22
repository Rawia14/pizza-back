package fr.idformation.pizzaback.service;

import java.util.List;

import fr.idformation.pizzaback.domain.Pizza;

public interface IPizzaService {

	/**
	 *
	 * @return all known pizzas
	 */

	List<Pizza> getAllPizzas();

}
