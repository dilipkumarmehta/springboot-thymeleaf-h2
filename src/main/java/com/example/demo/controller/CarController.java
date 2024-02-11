package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.CarServiceImpl;

@Controller
public class CarController {

	@Autowired

	CarServiceImpl carServiceImpl;

	@GetMapping({ "/" })
	public String home() {
		return "index";
	}

	@GetMapping({ "/useraction" })
	public ModelAndView userAction(@ModelAttribute Action action) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Congratulations!!!you have successfully booked Tata Bolt Car: ");
		modelAndView.setViewName("message");
		return modelAndView;
	}

	@GetMapping({ "/searchcarbyprice" })
	public String searchByCarCollection() {
		return "searchcarbyprice";
	}

	@GetMapping({ "/searchcarbybrand" })
	public String searchCarByBrand() {
		return "searchcarbybrand";
	}

	@GetMapping("/searchbybrand")
	public ModelAndView searchByBrand(@ModelAttribute Car car) {
		ModelAndView modelAndView = new ModelAndView();
		List<Car> carlist = carServiceImpl.searchByCarName(car.getBrand());
		if (carlist != null && !carlist.isEmpty()) {
			modelAndView.setViewName("cardetails");
			modelAndView.addObject("carlist", carlist);
		} else {
			modelAndView.addObject("message", "Sorry no matches found for the search criteria: " + car.getBrand());
			modelAndView.setViewName("message");
		}
		return modelAndView;
	}

	@GetMapping("/searchbyprice")
	public ModelAndView searchByPrice(@ModelAttribute Car car) {
		// Car car=null;
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Car> Carlist = new ArrayList<>();
		List<Car> carlist = carServiceImpl.searchByPrice(car.getPrice());
		if (carlist != null && !carlist.isEmpty()) {
			modelAndView.setViewName("cardetails");
			modelAndView.addObject("carlist", carlist);
		} else {
			modelAndView.addObject("message", "Sorry no matches found for the search criteria: " + car.getBrand());
			modelAndView.setViewName("message");
		}
		return modelAndView;
	}

}