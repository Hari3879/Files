package com.ojas.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.naming.AuthenticationException;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.DSR;
import com.ojas.entity.Employee;
import com.ojas.entity.Projects;
import com.ojas.entity.User;
import com.ojas.entity.UserRequest;
import com.ojas.entity.UserResponse;
import com.ojas.excep.MyApiException;
import com.ojas.repo.DsrRepo;
import com.ojas.service.UserService;
import com.ojas.service.impl.DsrServiceImpl;
import com.ojas.service.impl.EmpServiceImpl;
import com.ojas.service.impl.ProjectsSeriveImpl;
import com.ojas.service.impl.UserServiceImpl;
import com.ojas.utils.JwtUtil;

import coom.ojas.dateException.UserAunthorizedException;

/**
 * controller class
 * 
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
@Validated
public class UserController {
	@Autowired
	private DsrRepo dsrRepo;
	@Autowired
	private UserServiceImpl userimpl;
	@Autowired
	private UserService userService;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private DsrServiceImpl dsrServiceImpl;
	@Autowired
	private EmpServiceImpl employeeServiceImpl;

	@Autowired
	private ProjectsSeriveImpl projectServiceImpl;

	// *******************************************************************
	@PostMapping("/user")
	@ResponseStatus(HttpStatus.CREATED)
	public Integer saveUser(
			@Valid @RequestBody @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@ojas-it\\.com$", message = "Invalid email address") User user) {
		// System.out.println("controller");
		return userService.saveUser(user);

	}
	// *******************************************************************

	@PostMapping("/employeeRegister")
	public int create(@RequestBody Employee emp) {

		return employeeServiceImpl.createEmployee(emp);

	}
	// *******************************************************************

	@GetMapping("user")
	public List<User> getAll() throws IOException {

		List<User> user = userService.getAll();

		// Check if the user list is empty
		if (user.size() < 0) {
			// If it is, throw a UserAunthorizedException with a message
			throw new UserAunthorizedException("No data available for the specified date range");
		}

		// Otherwise, return the list of users

		return user;
	}

	@PostMapping("login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest request) throws AuthenticationException {
		System.out.println("enter login");
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		Optional<User> uob = userService.findByUsername(request.getUsername());
		if (!uob.isPresent()) {
			throw new UsernameNotFoundException("User not found");
		}
		String token = jwtUtil.generateJwtToken(request.getUsername());
		UserResponse userresponse = new UserResponse(token, "Successfully login", uob.get().getRoles());
		return ResponseEntity.ok(userresponse);
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	// *******************************************************************

	@PostMapping("Project")
	public String prpcre(@RequestBody Projects prp) {

		return projectServiceImpl.createProjects(prp);

	}

	@GetMapping("Project")
	public List<Projects> getAllProjects() {
		return projectServiceImpl.getALL();

	}

//*****************************************************
	// create Dsr
	@PostMapping("/dsr")
	// @CrossOrigin(origins = "http://localhost:3001", maxAge = 3600)
	public String dsrCreate(@RequestBody DSR dsr) {
		return dsrServiceImpl.createDsr(dsr);

	}

	@GetMapping("/dsr")
	@CrossOrigin(origins = "http://localhost:3001", maxAge = 3600)
	public List<DSR> getDSrDetails() {
		return dsrServiceImpl.getDsrdetails();
	}

	@PutMapping("/dsr")
	public String UpdateDsrDetails(@RequestBody DSR dsr) {

		return dsrServiceImpl.updateDsr(dsr);

	}
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@DeleteMapping("/dsr/{id}")
	public String deleteDSRDetails(@PathVariable("id") long id) {
		return dsrServiceImpl.deleteDSR(id);

	}

//*****************************************************
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable("id") int id) {

		return userService.delete(id);

	}

	@GetMapping("/dsrdate")
	public List<DSR> getdatebwdates(@RequestParam @Valid Date startDate, @RequestParam @Valid Date endDate) {
		if (startDate.after(endDate)) {
			throw new IllegalArgumentException("The 'from' date must be earlier than the 'to' date.");
		}
		List<DSR> data = dsrRepo.findByDateBetween(startDate, endDate);

		if (data.isEmpty()) {

			throw new ObjectNotFoundException("No data available for the specified date range", null);
		}
		return data;
	}

	@GetMapping("/dsr/currentMonthDetails")
	public List<DSR> getCurrentData() {
		List<DSR> data = dsrRepo.currentMonthData();

		if (data.isEmpty()) {

			throw new ObjectNotFoundException("No data available for the specified date range", null);
		}

		return data;
	}
	//******************************************
	
	@PostMapping("/{username}/change-password")

	public ResponseEntity<String> changePassword(

	@PathVariable("username") String username,

	@RequestParam("oldPassword") String oldPassword,

	@RequestParam("newPassword") String newPassword) throws InvalidObjectException {

	
	userService.changePassword(username, oldPassword, newPassword);

	

	return ResponseEntity.ok("Password changed successfully");

	}
}
