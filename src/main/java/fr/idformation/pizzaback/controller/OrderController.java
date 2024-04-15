package fr.idformation.pizzaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.pizzaback.dto.mapper.OrderMapper;
import fr.idformation.pizzaback.service.IOrderService;

@RestController
@RequestMapping("/order")

public class OrderController {

	/** service for orders. */
	@Autowired
	private IOrderService orderService;

	/**
	 * @return all types
	 */
	@GetMapping("/")
	public List<OrderDto> getAll() {
		return OrderMapper.ordersToDto(orderService.getAll());
	}

}
