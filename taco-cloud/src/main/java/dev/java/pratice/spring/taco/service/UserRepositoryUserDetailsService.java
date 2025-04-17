package dev.java.pratice.spring.taco.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.java.pratice.spring.taco.model.Users;
import dev.java.pratice.spring.taco.repository.UsersRepository;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

	private UsersRepository userRepo;

	public UserRepositoryUserDetailsService(UsersRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByUsername(username);

		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("User '" + username + "' not found");
		}
	}

}
