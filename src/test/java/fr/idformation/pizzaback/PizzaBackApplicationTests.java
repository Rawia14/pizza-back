package fr.idformation.pizzaback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.idformation.pizzaback.domain.Pizza;
import fr.idformation.pizzaback.dto.PizzaDTO;
import fr.idformation.pizzaback.dto.mapper.PizzaMapper;

@SpringBootTest
class PizzaBackApplicationTests {

	@Test
	public void testPizzasToDtos() {
		List<Pizza> pizzas = new ArrayList<>();

		List<PizzaDTO> dtos = PizzaMapper.pizzasToDtos(pizzas);

		assertEquals(pizzas.size(), dtos.size());
	}

	@Test
	public void testPizzaToDto() {
		Pizza pizza = new Pizza();

		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		assertEquals(pizza.getpiz_Id(), dto.getPizza_id());
		assertEquals(pizza.getName(), dto.getName());
		assertEquals(pizza.getDescription(), dto.getDescription());
		assertEquals(pizza.getImage(), dto.getImage());
		assertEquals(pizza.getPrice(), dto.getPrice(), 0);
	}

	@Test
	public void testDtoToEntity() {
		PizzaDTO dto = new PizzaDTO();

		Pizza entity = PizzaMapper.dtoToEntity(dto);

		assertEquals(dto.getPizza_id(), entity.getpiz_Id());
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getImage(), entity.getImage());
		assertEquals(dto.getPrice(), entity.getPrice(), 0);
	}

}
