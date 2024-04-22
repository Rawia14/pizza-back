/**
 * 
 */
package fr.idformation.pizzaback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.pizzaback.security.models.User;
import fr.idformation.pizzaback.security.repository.UserRepository;

/**
 * 
 */
@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}
}