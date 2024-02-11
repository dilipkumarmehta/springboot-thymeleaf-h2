package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	@Query(value = "SELECT * FROM CAR WHERE brand = ?1", nativeQuery = true)
	public List<Car> searchByCarName(String brand);

	@Query(value = "SELECT * FROM CAR WHERE price >?1", nativeQuery = true)
	public List<Car> searchByPriceg(Long price);
	
	@Query(value = "SELECT * FROM CAR WHERE price <?1", nativeQuery = true)
	public List<Car> searchByPricel(Long price);
}
