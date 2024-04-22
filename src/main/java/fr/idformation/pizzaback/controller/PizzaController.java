package fr.idformation.pizzaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.pizzaback.dto.PizzaDTO;
import fr.idformation.pizzaback.dto.mapper.PizzaMapper;
import fr.idformation.pizzaback.service.IPizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

	/** pizza service. */
	@Autowired
	private IPizzaService pizzaService;

	/**
	 * @return all pizzas
	 */
	@GetMapping("/")
	public List<PizzaDTO> getAll() {
		return PizzaMapper.pizzasToDtos(pizzaService.getAllPizzas());
	}

}
