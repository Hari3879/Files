package com.ojas.service.impl;

import java.io.InvalidObjectException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ojas.entity.User;
import com.ojas.repo.UserRepository;
import com.ojas.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	@Autowired(required = true)
	private UserRepository repo;
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;

	@Override
	public Integer saveUser(User user) {
		System.out.println("implimentation class");
		user.setPassword(pwdEncoder.encode(user.getPassword()));
		return repo.save(user).getId();
	}

	@Override
	public Optional<User> findByUsername(String username) {

		return repo.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Optional<User> opt = findByUsername(username);

		System.out.println("==========================>" + opt);
		if (!opt.isPresent()) {
			throw new UsernameNotFoundException("User not exist");
		}
		User user = opt.get();

		return new org.springframework.security.core.userdetails.User(username, user.getPassword(),
				user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toList()));
	}

	@Override
	public List<User> getAll() {

		return repo.findAll();
	}

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "delete Successfully";
	}
	

	public void changePassword(String username, String oldPassword, String newPassword) throws InvalidObjectException {

		User user = repo.findByUsername(username)

		.orElseThrow(() -> new UsernameNotFoundException("User not found"));


		if (!pwdEncoder.matches(oldPassword, user.getPassword())) {

		throw new InvalidObjectException("Invalid old password");

		}

	

		String hashedPassword = pwdEncoder.encode(newPassword);

		user.setPassword(hashedPassword);



		repo.save(user);

		}

//	public boolean changePassword(String username, String oldPassword, String newPassword) {
//		// Retrieve the user from the database
//		User user = userRepository.findByUsername(username);
//
//		// Verify the old password
//		if (!passwordEncoder.matches(oldPassword, user.getPassword())) {
//		return false;
//		}
//
//		// Encode the new password
//		String encodedPassword = passwordEncoder.encode(newPassword);
//
//		// Update the user's password in the database
//		user.setPassword(encodedPassword);
//		userRepository.save(user);
//
//		return true;
//		}

}
