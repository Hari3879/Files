package com.ojas.springboot.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Product {
	
	private Integer pId;
	@NotBlank(message="name is mandatory")
	@Size(min=1,message="required")
	private String pName;
	private Integer qty;
	private Integer price;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product(Integer pId,
			@NotBlank(message = "name is mandatory") @Size(min = 1, message = "required") String pName, Integer qty,
			Integer price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
