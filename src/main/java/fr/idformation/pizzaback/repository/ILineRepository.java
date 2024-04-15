package fr.idformation.pizzaback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.pizzaback.domain.Line;

@Repository
public interface ILineRepository extends JpaRepository<Line, Short> {

	List<Line> findByNameStartingWith(String name);

}
