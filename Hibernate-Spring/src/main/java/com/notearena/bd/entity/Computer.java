package com.notearena.bd.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="computer")
public class Computer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;	
	private String brand;
	private double price;
	
	@OneToMany
	private List<User> user;
	
	/**
	 * 
	 */
	public Computer() {

	}
	

	

	/**
	 * @param cid
	 * @param brand
	 * @param price
	 * @param user
	 */
	public Computer(int cid, String brand, double price, List<User> user) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.price = price;
		this.user = user;
	}





	/**
	 * @param brand
	 * @param price
	 * @param user
	 */
	public Computer(String brand, double price, List<User> user) {
		super();
		this.brand = brand;
		this.price = price;
		this.user = user;
	}




	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
