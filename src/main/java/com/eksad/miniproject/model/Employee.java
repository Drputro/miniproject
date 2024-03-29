package com.eksad.miniproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String phone;
	
	@Column(nullable=false)
	private int age;
	
	@Column(nullable=false)
	private String pob;
	
	@Column(nullable = false)
	private int salary;
	
	@Column(nullable = false)
	private int id_div;
	
}
