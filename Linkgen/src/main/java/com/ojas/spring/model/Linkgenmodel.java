package com.ojas.spring.model;

import java.util.List;

public class Linkgenmodel {
	private String  msg;
	private  Menu menu;
	public Linkgenmodel() {}
	public Linkgenmodel(String msg, Menu menu) {
		super();
		this.msg = msg;
		this.menu = menu;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	

}
