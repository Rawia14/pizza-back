package fr.idformation.pizzaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.pizzaback.domain.Order;
import fr.idformation.pizzaback.dto.OrderDTO;
import fr.idformation.pizzaback.dto.mapper.OrderMapper;
import fr.idformation.pizzaback.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService orderService;

	@PostMapping("/save")
	public ResponseEntity<OrderDTO> save(@RequestBody OrderDTO orderDTO) {
		Order order = OrderMapper.dtoToEntity(orderDTO);
		Order savedOrder = orderService.save(order);
		OrderDTO savedOrderDTO = OrderMapper.orderToDto(savedOrder);
		return ResponseEntity.ok(savedOrderDTO);
	}
}
