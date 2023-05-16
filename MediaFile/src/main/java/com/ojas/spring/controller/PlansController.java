package com.ojas.spring.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.spring.dao.PlansServiceImpl;
import com.ojas.spring.entity.Plans;
/**
 * 
 * this is controller
 *
 */
@RestController
public class PlansController {
	@Autowired
	private PlansServiceImpl serviceImpl;

	@PostMapping("/admin/create")
	public String create(@RequestBody Plans plans) {
		System.out.println(plans);
		try {
			serviceImpl.create(plans);
			return "created";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return " not created";
		}

	}

	@GetMapping("/admin/getall")
	public List<Plans> view() {
		return serviceImpl.viewAll();

	}

	@GetMapping("/admin/getbyid/{id}")
	public Optional<Plans> getbyId(@PathVariable int id) {

		return serviceImpl.getById(id);
	}

	@DeleteMapping("/admin/delete/{id}")
	public void delete(@PathVariable int id) {
		serviceImpl.deleteById(id);
		System.out.println("deleted");
	}

	@PutMapping("/admin/update")
	public Plans update(@RequestBody Plans plan) {
		return serviceImpl.update(plan);
	}

}
