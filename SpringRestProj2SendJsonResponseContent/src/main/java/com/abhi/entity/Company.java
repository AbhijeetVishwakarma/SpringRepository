package com.abhi.entity;

import java.io.Serializable;

public class Company implements Serializable{
	private static final long serialVersionUID = 1174367170189448334L;
	
	private String name;
	private String location;
	private String category;
	private Integer size;
	private Double turnOver;
	
	public Company(String name, String location, String category, Integer size, Double turnOver) {
		super();
		this.name = name;
		this.location = location;
		this.category = category;
		this.size = size;
		this.turnOver = turnOver;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", category=" + category + ", size=" + size
				+ ", turnOver=" + turnOver + "]";
	}
	

}
