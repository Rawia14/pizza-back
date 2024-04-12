package fr.idformation.pizzaback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.idformation.pizzaback.domain.User1;
import fr.idformation.pizzaback.repository.IUser1Repository;
import fr.idformation.pizzaback.service.IUser1Service;

public class User1Service implements IUser1Service {

	/** repository for the user1s. */
	@Autowired
	private IUser1Repository user1Repo;

	@Autowired
	public List<User1> getAll() {
		return user1Repo.findAll();
	}

}
