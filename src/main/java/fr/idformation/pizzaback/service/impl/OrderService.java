package fr.idformation.pizzaback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.pizzaback.domain.Order;
import fr.idformation.pizzaback.repository.IOrderRepository;
import fr.idformation.pizzaback.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	/** repository for the orders. */
	private final IOrderRepository orderRepo;

	@Autowired
	public OrderService(IOrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}

	@Override
	public List<Order> getAll() {
		return orderRepo.findAll();
	}
}
