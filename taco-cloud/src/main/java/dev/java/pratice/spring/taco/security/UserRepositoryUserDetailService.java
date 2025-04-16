package dev.java.pratice.spring.taco.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserRepositoryUserDetailService implements UserDetailsService {

	private UserRepository userRepo;

	public UserRepositoryUserDetailService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);

		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("User '" + username + "' not found.");
		}
	}
}
