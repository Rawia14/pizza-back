package fr.idformation.pizzaback.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.idformation.pizzaback.security.models.User;
import fr.idformation.pizzaback.service.impl.UserService;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	private final UserService userService;

	@Autowired
	public UserDetailsServiceImpl(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		throw new UnsupportedOperationException("Method not supported.");
	}

	public User loadUserDetails(String username) throws UsernameNotFoundException {
		throw new UnsupportedOperationException("Method not supported.");
	}

	public User update(User user) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	public User save(User user) {
		return userService.saveUser(user);
	}

	public void addUserToRole(Long id, Long valueOf) {
		// TODO Auto-generated method stub

	}

	public boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}
}
