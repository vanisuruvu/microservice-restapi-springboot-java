package com.ninja.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Table
//@Data
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name="demo_entity")
public class DemoEntity {
 
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
 @Column(name="customer_id")
 private Long customerID;
public DemoEntity(Long customerID, String customerName, String customerEmail, String customerCity) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.customerCity = customerCity;
}

public Long getCustomerID() {
	return customerID;
}

public void setCustomerID(Long customerID) {
	this.customerID = customerID;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerEmail() {
	return customerEmail;
}

public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}

public String getCustomerCity() {
	return customerCity;
}

public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}

// @NotBlank (message = "Customer Name is mandatory")
 @Column(name="customer_name", nullable=false)
 private String customerName;
 @Column(name="customer_email")
 private String customerEmail;
 @Column(name="customer_city")
 private String customerCity;
 
 public DemoEntity() {}
}
