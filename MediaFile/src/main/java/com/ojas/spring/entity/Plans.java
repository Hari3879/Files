package com.ojas.spring.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "plans")
@SQLDelete(sql = "UPDATE plans SET visibility = true WHERE id=?")
@Where(clause = "visibility=false")
public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String planName;
	private double price;
	private double storage;
	private String discription;
	private boolean visibility;
	private LocalDateTime publisheddate;

	public Plans() {
	}


	


	public Plans(int id, String planName, double price, double storage, String discription, boolean visibility,
			LocalDateTime publisheddate) {
		super();
		this.id = id;
		this.planName = planName;
		this.price = price;
		this.storage = storage;
		this.discription = discription;
		this.visibility = visibility;
		this.publisheddate = publisheddate;
	}





	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
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


	public LocalDateTime getPublisheddate() {
		return publisheddate;
	}


	public void setPublisheddate(LocalDateTime publisheddate) {
		this.publisheddate = publisheddate;
	}


	public boolean isVisibility() {
		return visibility;
	}





	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}





	@Override
	public String toString() {
		return "Plans [id=" + id + ", planName=" + planName + ", price=" + price + ", storage=" + storage
				+ ", discription=" + discription + ", visibility=" + visibility + ", publisheddate=" + publisheddate
				+ "]";
	}





	
	
}
