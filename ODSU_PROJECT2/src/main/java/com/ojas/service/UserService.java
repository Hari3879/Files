package com.ojas.service;

import java.io.InvalidObjectException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ojas.entity.User;
@Service
public interface UserService {
Integer saveUser(User user);

List<User> getAll();
Optional<User> findByUsername(String username);
String delete(int id);
public void changePassword(String username, String oldPassword, String newPassword) throws InvalidObjectException;
}
