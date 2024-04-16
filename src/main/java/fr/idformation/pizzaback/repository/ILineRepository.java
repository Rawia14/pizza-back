package fr.idformation.pizzaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.pizzaback.domain.Line;

@Repository
public interface ILineRepository extends JpaRepository<Line, Long> {

	Line findById(Short id);

}
