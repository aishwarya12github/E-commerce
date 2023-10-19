package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "userid")
	private List<PrdCategory> prdcategorylist;
	
	@OneToMany(mappedBy = "userid")
	private List<Address> addresslist;
	
	@OneToMany(mappedBy = "userid")
	private List<Payment> paymentlist;
	
	@OneToOne(targetEntity = Cart.class, cascade = CascadeType.ALL)
	private Cart cart;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public List<PrdCategory> getPrdcategorylist() {
		return prdcategorylist;
	}
	public void setPrdcategorylist(List<PrdCategory> prdcategorylist) {
		this.prdcategorylist = prdcategorylist;
	}
	
	
	public List<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}
	
	
	public List<Payment> getPaymentlist() {
		return paymentlist;
	}
	public void setPaymentlist(List<Payment> paymentlist) {
		this.paymentlist = paymentlist;
	}
	
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", prdcategorylist=" + prdcategorylist + ", addresslist="
				+ addresslist + ", paymentlist=" + paymentlist + ", cart=" + cart + "]";
	}
	
	
	
	
	

}
