package com.ojas.spring.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.spring.config.AppConfig;
import com.ojas.spring.dao.PeopleDAO;
import com.ojas.spring.dao.PeopleDAOImpl;
import com.ojas.spring.model.People;

public class PeopleApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PeopleDAO dao = context.getBean(PeopleDAOImpl.class);

		System.out.println("List of Peoples");
		List<People> peoples = dao.getAllPeople();
		for (People p : peoples) {
			System.out.println(p);
		}

		System.out.println("create");
		People people1 = new People(102, 567, "hari", "jjj");

		boolean create = dao.createPeople(people1);
		System.out.println(create);

		System.out.println("update");
		People p2 = new People();                                                                                                          

		System.out.println("by id  view emp");
		People p = dao.getPeopleById(1);

		System.out.println(p);

	}

}
