package com.ojas.spring.dao;

import java.util.List;

import com.ojas.spring.model.People;

public interface PeopleDAO {

//	List<People> getPeopleById(int id);
	People getPeopleById(int id);

	List<People> getAllPeople();

	boolean deletePeople(People people);

	boolean updatePeople(People people);


	boolean createPeople(People people);

	

}
