package com.ojas.spring.dao;

import java.util.List;
import java.util.Optional;

import com.ojas.spring.entity.Plans;

public interface PlansServiceDao {

	public Plans create(Plans plans);
	public List<Plans> viewAll();
	public Optional<Plans> getById(int id);
	public  void deleteById(int id);
	public Plans update( Plans plans);
//	public Plans historycreate(Plans plans);
	
	
	
		


}
