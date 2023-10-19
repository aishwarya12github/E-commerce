package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cartname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCartname() {
		return cartname;
	}
	public void setCartname(String cartname) {
		this.cartname = cartname;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartname=" + cartname + "]";
	}
	
	
	

}
