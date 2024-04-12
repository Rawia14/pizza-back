package fr.idformation.pizzaback.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.pizzaback.domain.Pizza;
import fr.idformation.pizzaback.domain.User1;
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

			dto.setPizza_id(pizza.getpizza_Id());
			dto.setName(pizza.getName());
			dto.setDescription(pizza.getDescription());
			dto.setImage(pizza.getImage());
			dto.setPrice(pizza.getPrice());

			if (pizza.getUsers() != null && !pizza.getUsers().isEmpty()) {
				List<Short> user1Ids = new ArrayList<>();

				for (User1 user1 : pizza.getUsers()) {
					user1Ids.add(user1.getId());
				}

				dto.setUser1s(user1Ids);
			}
		}

		return dto;
	}

	public static Pizza dtoToEntity(final PizzaDTO dto) {
		Pizza entity = null;

		if (dto != null) {
			entity = new Pizza();
			entity.setpizza_Id(dto.getPizza_id());
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			entity.setImage(dto.getImage());
			entity.setPrice(dto.getPrice());
			if (dto.getUser1s() != null) {
				for (short id : dto.getUser1s()) {
					entity.addUser(new User1(id));
				}
			}
		}

		return entity;
	}

}
