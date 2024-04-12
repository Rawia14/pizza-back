package fr.idformation.pizzaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.pizzaback.dto.PizzaDTO;
import fr.idformation.pizzaback.mapper.PizzaMapper;
import fr.idformation.pizzaback.service.IPizzaService;

@RestController
@RequestMapping("pizza")
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

	@GetMapping("/search")
	public List<PizzaDTO> getAll(@RequestParam final String name) {
		return PizzaMapper.pizzasToDtos(pizzaService.getAllPizzasByName(name));
	}

	@GetMapping("/{id}")
	public PizzaDTO getOne(@PathVariable("id") final Short id) {
		return PizzaMapper.pizzaToDto(pizzaService.getOne(id));
	}
}
