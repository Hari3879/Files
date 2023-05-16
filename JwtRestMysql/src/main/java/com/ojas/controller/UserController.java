package com.ojas.controller;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
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
import com.ojas.repo.DsrRepo;
import com.ojas.service.UserService;
import com.ojas.service.impl.DsrServiceImpl;
import com.ojas.service.impl.EmpServiceImpl;
import com.ojas.service.impl.ProjectsSeriveImpl;
import com.ojas.utils.JwtUtil;

/**
 * controller class
 * 
 */

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
@Validated
public class UserController {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private DsrRepo repo1;

	@Autowired
	private UserService service;
	@Autowired
	private JwtUtil util;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private DsrServiceImpl dsrService;
	@Autowired
	private EmpServiceImpl serviceemp;

	@Autowired
	private ProjectsSeriveImpl prpService;

	// *******************************************************************
	// User register
	// http://localhost:9899/user/save
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public String saveUser(@Valid @RequestBody User user) {
		System.out.println("controller");
		return service.saveUser(user);

	}

	// *******************************************************************
	// emp register
	// http://localhost:9899/user/saveEmp
	@PostMapping("/saveEmp")
	public int create(@RequestBody Employee emp) {
		return serviceemp.createEmployee(emp);

	}

	// *******************************************************************
	// get all users
	// http://localhost:9899/user/getAll
	//@PreAuthorize("hasAuthority('SCOPE_my-scope')")
	@GetMapping("/getAll")
	public List<User> getAll() {
		return service.getAll();

	}

	// *******************************************************************
	// User login
	// http://localhost:9899/user/login
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest request) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		String token = util.generateJwtToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token, "Success fully log in"));

	}
	// *******************************************************************

	// create Dsr
	// http://localhost:9899/user/saveDsr
	@PostMapping("/saveDsr")
	@CrossOrigin(origins = "http://localhost:3001", maxAge = 3600)
	public String dsrCreate(@RequestBody DSR dsr) {
		return dsrService.createDsr(dsr);

	}

	// *******************************************************************
	// projects adding
	// http://localhost:9899/user/savePrp
	@PostMapping("/savePrp")
	public String prpcre(@RequestBody Projects prp) {

		return prpService.createProjects(prp);

	}

	// *******************************************************************
	// get the projects
	// http://localhost:9899/user/get
	@GetMapping("/get")
	public List<Projects> get() {
		return prpService.getALL();

	}

	// *******************************************************************

	// Dsr details get
	// http://localhost:9899/user/getDsr
	@GetMapping("/getDSr")
	// @CrossOrigin(origins = "http://localhost:3001", maxAge = 3600)
	public List<DSR> getDSr() {
		return dsrService.getDsrdetails();

	}
	// *******************************************************************

	// update dsr
	// http://localhost:9899/user/updatedsr
	@PutMapping("/updatedsr")
	public String updateDsr(@RequestBody DSR dsr) {

		return dsrService.updateDsr(dsr);

	}

	// delete dsr
	// http://localhost:9899/user/deleteDsr/
	@DeleteMapping("/deleteDsr/{id}")

	public String deletedsr(@PathVariable("id") long id) {

		return dsrService.deleteDsr(id);

	}

	// *******************************************************************
	// get dsr data bw dates
	// http://localhost:9899/user/getdata
	@GetMapping("/getdata")
	public List<DSR> getdatebwdates(@RequestParam @Valid Date startDate, @RequestParam @Valid Date endDate) {
		if (startDate.after(endDate)) {
			throw new IllegalArgumentException("The 'from' date must be earlier than the 'to' date.");
		}
		List<DSR> data = repo1.findByDateBetween(startDate, endDate);

		if (data.isEmpty()) {

			throw new ObjectNotFoundException("No data available for the specified date range", null);

		}

		return data;

	}

	// *******************************************************************
	// email function
	// http://localhost:9899/user/mail
	@PostMapping("/mail")
	public void simpleMessage() {
		service.sendSimpleMsg();
		System.out.println("completed");
	}

	// delete user by id
	// http://localhost:9899/user/deleteUser/
	@CrossOrigin(origins = "http://localhost:3001", maxAge = 3600)
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {

		return service.delete(id);

	}

	// currentmonthdata
	// http://localhost:9899/user/currentMonthdata
	@GetMapping("/currentMonthdata")
	public List<DSR> Current() {
		List<DSR> data = repo1.curentmonthdata();

		if (data.isEmpty()) {

			throw new ObjectNotFoundException("No data available for the specified date range", null);

		}

		return data;

	}
	


}
