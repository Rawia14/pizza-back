package fr.idformation.pizzaback.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.pizzaback.security.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Enregistre un nouvel utilisateur.
	 *
	 * @param user l'utilisateur à enregistrer
	 * @return l'utilisateur enregistré
	 */
	User save(User user);

}
