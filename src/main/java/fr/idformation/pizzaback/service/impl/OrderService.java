package fr.idformation.pizzaback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.pizzaback.domain.Order;
import fr.idformation.pizzaback.repository.IOrderRepository;
import fr.idformation.pizzaback.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;

	@Override
	public Order save(Order order) {
		return orderRepository.save(order);
	}

}
