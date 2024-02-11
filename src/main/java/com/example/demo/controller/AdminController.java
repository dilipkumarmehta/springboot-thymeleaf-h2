package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CarServiceImpl;

@RestController
public class AdminController {

	@Autowired
	CarServiceImpl carServiceImpl;

	@PostMapping("/car")
	public String saveCar(@RequestBody Car car) {
		System.out.println(car);
		carServiceImpl.save(car);
		return null;

	}

}
