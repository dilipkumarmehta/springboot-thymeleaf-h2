package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.controller.Car;

public interface CarService {

	public String save(Car emp);

	public List<Car> searchByCarName(String brand);

	public List<Car> searchByPrice(Long price);

}
