package com.spring.orm.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@Column(name ="student_id")
	private int Id;
	@Column(name ="student_name")
	private String name;
	@Column(name ="student_city")
	private String city;
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", city=" + city + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String name, String city) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

