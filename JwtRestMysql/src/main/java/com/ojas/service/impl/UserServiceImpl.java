package com.ojas.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
	
	
	 @Autowired
	private JavaMailSender mailSender;
	@Autowired(required = true)
	private UserRepository repo;
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;

	@Override
	public String saveUser(User user) {
		System.out.println("implimentation class");
		user.setPassword(pwdEncoder.encode(user.getPassword()));
		repo.save(user).getId();
		return "User register success";
	}

	@Override
	public Optional<User> findByUsername(String username) {

		return repo.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> opt = findByUsername(username);
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
	@Override
    public String sendSimpleMsg() {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("pravalikasrinivas531@gmail.com");
        message.setTo("oharikrishna3879@gmail.com");
        message.setSubject("Credentials for your Dsr Ac");
        message.setText("Good Eveing");
        mailSender.send(message);
        System.out.println("Success...........");
		return "done";
    }
}
