package com.example.demo.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, name = "carId")
	Long carId;
	@Column(nullable = false, name = "brand")
	String brand;
	@Column(nullable = false, name = "model")
	String model;
	@Column(nullable = false, name = "noOfKms")
	String noOfKms;
	@Column(nullable = false, name = "price")
	Long price;
	@Column(nullable = false, name = "fuel")
	String fuel;
	@Column(nullable = false, name = "years")
	String year;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNoOfKms() {
		return noOfKms;
	}
	public void setNoOfKms(String noOfKms) {
		this.noOfKms = noOfKms;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", noOfKms=" + noOfKms + ", price="
				+ price + ", fuel=" + fuel + ", year=" + year + "]";
	}
	


}
