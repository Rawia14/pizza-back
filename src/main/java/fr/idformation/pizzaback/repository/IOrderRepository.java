package fr.idformation.pizzaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.idformation.pizzaback.domain.Order;

public interface IOrderRepository extends JpaRepository<Order, Short> {

}
