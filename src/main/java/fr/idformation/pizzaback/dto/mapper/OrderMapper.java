package fr.idformation.pizzaback.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;

import fr.idformation.pizzaback.domain.Order;
import fr.idformation.pizzaback.dto.OrderDTO;

public class OrderMapper {

	public static List<OrderDTO> ordersToDtos(final List<Order> orders) {
		List<OrderDTO> dtos = null;

		if (orders != null) {
			dtos = new ArrayList<>();

			for (Order order : orders) {
				dtos.add(orderToDto(order));
			}
		}

		return dtos;
	}

	private static OrderDTO orderToDto(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public static OrderDTO ordersToDtos(final Order Order) {

		OrderDTO dto = null;

		if (Order != null) {
			dto = new OrderDTO();

			dto.setOrd_id(Order.getId());
			dto.setUsr_id1(Order.getUsr_id());
			dto.setDate(Order.getDate());
			dto.setTotal_amount(Order.getTotal_amount());

		}

		return dto;

	}

	public static List<OrderDto> ordersToDto(List<Order> all) {
		// TODO Auto-generated method stub
		return null;
	}
}
