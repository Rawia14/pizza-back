package fr.idformation.pizzaback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.idformation.pizzaback.domain.Pizza;
import fr.idformation.pizzaback.repository.IPizzaRepository;
import fr.idformation.pizzaback.service.IPizzaService;

public class PizzaService implements IPizzaService {

	/** repository for the Pizza. */
	@Autowired
	private IPizzaRepository pizzaRepo;

	@Autowired
	public List<Pizza> getAllPizzas() {
		return pizzaRepo.findAll();
	}

	@Autowired
	public Pizza getOne(final Short id) {
		return pizzaRepo.getReferenceById(id);
	}

	@Override
	public List<Pizza> getAllPizzasByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
