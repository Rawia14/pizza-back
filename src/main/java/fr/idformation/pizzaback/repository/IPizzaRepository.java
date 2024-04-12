package fr.idformation.pizzaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.pizzaback.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Short> {

	List<Pizza> findByNameStartingWith(String name);
}
