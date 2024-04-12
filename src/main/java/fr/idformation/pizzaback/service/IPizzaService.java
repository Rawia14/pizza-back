package fr.idformation.pizzaback.service;

import java.util.List;

import fr.idformation.pizzaback.domain.Pizza;

public interface IPizzaService {

	/**
	 *
	 * @return all known pizzas
	 */

	List<Pizza> getAllPizzas();

	/**
	 * Find a pizza from its id.
	 *
	 * @param id the id of the pizza
	 * @return the pizza with the given id
	 */
	Pizza getOne(Short id);

	List<Pizza> getAllPizzasByName(String name);

}
