package com.ojas.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ojas.spring.model.People;
import com.ojas.spring.model.PeopleMapper;
@Component
public class PeopleDAOImpl implements PeopleDAO {
	@Autowired
	public JdbcTemplate jt;

	
//	public PeopleDAOImpl(JdbcTemplate jt) {
//		this.jt = jt;
//	}

	@Override
	public People getPeopleById(int id) {
		// TODO Auto-generated method stub
		return jt.queryForObject("SELECT * FROM PEOPLE WHERE ID=?", new Object[] { id }, new PeopleMapper());
	}

	@Override
	public List<People> getAllPeople() {
		// TODO Auto-generated method stub
		return jt.query("SELECT * FROM people", new PeopleMapper());
	}

	@Override
	public boolean deletePeople(People people) {
		return jt.update("DELETE FROM people WHERE id=?", people.getId()) > 0;

	}

	@Override
	public boolean updatePeople(People people) {
		// TODO Auto-generated method stub
		return jt.update("UPDATE people SET first_name=?, last_name=?,age=? WHERE id=?", people.getFirstName(),
				people.getLastName(), people.getAge(), people.getId()) > 0;
	}

	@Override
	public boolean createPeople(People people) {
		// TODO Auto-generated method stub
		return jt.update("INSERT INTO people VALUES(?,?,?,?)", people.getId(), people.getFirstName(),
				people.getLastName(), people.getAge()) > 0;
	}

}
