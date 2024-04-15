package fr.idformation.pizzaback.service;

import java.util.List;

import fr.idformation.pizzaback.domain.Line;

public interface ILineService {

	/**
	 * Retrieves all known lines in the order.
	 * 
	 * @return a list of all lines in the order
	 */
	List<Line> getAll();

	/**
	 * Retrieves a single line by its ID.
	 * 
	 * @param id the ID of the line to retrieve
	 * @return the line with the specified ID, or null if no such line exists
	 */
	Line getOne(Short id);
}
