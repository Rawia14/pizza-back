package fr.idformation.pizzaback.dto.mapper;

import fr.idformation.pizzaback.domain.Order;
import fr.idformation.pizzaback.dto.OrderDTO;

public class OrderMapper {

	public static Order dtoToEntity(OrderDTO orderDTO) {
		if (orderDTO == null) {
			return null;
		}

		Order order = new Order();
		order.setId(orderDTO.getOrd_id());
		order.setUsr_id(orderDTO.getUsr_id());
		order.setDate(orderDTO.getDate());
		order.setTotal_amount(orderDTO.getTotal_amount());
		return order;
	}

	public static OrderDTO orderToDto(Order order) {
		if (order == null) {
			return null;
		}
		OrderDTO dto = new OrderDTO();
		dto.setOrd_id(order.getId());
		dto.setUsr_id(order.getUsr_id());
		dto.setDate(order.getDate());
		dto.setTotal_amount(order.getTotal_amount());
		return dto;
	}
}
