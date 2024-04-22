package fr.idformation.pizzaback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.pizzaback.domain.Pizza;
import fr.idformation.pizzaback.repository.IPizzaRepository;
import fr.idformation.pizzaback.service.IPizzaService;

@Service
public class PizzaService implements IPizzaService {

	/** repository for the Pizza. */
	private final IPizzaRepository pizzaRepo;

	@Autowired
	public PizzaService(IPizzaRepository pizzaRepo) {
		this.pizzaRepo = pizzaRepo;
	}

	@Override
	public List<Pizza> getAllPizzas() {
		return pizzaRepo.findAll();
	}

}
