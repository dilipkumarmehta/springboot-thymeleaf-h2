package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepository;

	@Override
	public String save(Car car) {
		carRepository.save(car);
		return null;
	}

	public List<Car> searchByPrice(Long price) {
		if (price == 5)
			return carRepository.searchByPriceg(price);
		else
			return carRepository.searchByPricel(price);

	}

	public List<Car> searchByCarName(String brand) {
		return carRepository.searchByCarName(brand);

	}
}