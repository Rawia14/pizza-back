package fr.idformation.pizzaback.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.pizzaback.domain.Pizza;
import fr.idformation.pizzaback.dto.PizzaDTO;

public class PizzaMapper {

	public static List<PizzaDTO> pizzasToDtos(final List<Pizza> pizzas) {
		List<PizzaDTO> dtos = null;

		if (pizzas != null) {
			dtos = new ArrayList<>();

			for (Pizza pizza : pizzas) {
				dtos.add(pizzaToDto(pizza));
			}
		}

		return dtos;
	}

	public static PizzaDTO pizzaToDto(final Pizza pizza) {
		PizzaDTO dto = null;

		if (pizza != null) {
			dto = new PizzaDTO();

			dto.setPizza_id(pizza.getpiz_Id());
			dto.setName(pizza.getName());
			dto.setDescription(pizza.getDescription());
			dto.setImage(pizza.getImage());
			dto.setPrice(pizza.getPrice());

		}

		return dto;
	}

	public static Pizza dtoToEntity(final PizzaDTO dto) {
		Pizza entity = null;

		if (dto != null) {
			entity = new Pizza();
			entity.setpiz_Id(dto.getPizza_id());
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			entity.setImage(dto.getImage());
			entity.setPrice(dto.getPrice());

		}

		return entity;
	}

}
