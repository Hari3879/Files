package com.ojas.spring.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "planshistory")

public class PlansHistory {
	
	private int id;
	private String planName;
	private double price;
	private double storage;
	private String discription;
	
	
	@Id
	private LocalDateTime publisheddate;

	public PlansHistory() {

	}

	public PlansHistory(int id, String planName, double price, double storage, String discription, LocalDateTime publisheddate) {
		super();
		this.id = id;
		this.planName = planName;
		this.price = price;
		this.storage = storage;
		this.discription = discription;
		this.publisheddate = publisheddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public LocalDateTime getPublisheddate() {
		return publisheddate;
	}

	public void setPublisheddate(LocalDateTime publisheddate) {
		this.publisheddate = publisheddate;
	}

}
