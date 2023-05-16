package com.ojas.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity@Table(name="PRODUCT")
public class ProductEntity {
	@Id
	@Column(name="productId")
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.AUTO)
	private Integer pId;
	@Column(name="PRODUCT_NAME")
	private String pName;
	@Column(name="QUANTITY")
	private Integer qty;
	@Column(name="PRICE")
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
	public ProductEntity(Integer pId, String pName, Integer qty, Integer price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
	}
	public ProductEntity() {
		super();
	}
	@Override
	public String toString() {
		return "ProductEntity [pId=" + pId + ", pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
