package com.example.demo.controller;

public class Action {

	private String boorCar;
	@Override
	public String toString() {
		return "Action [boorCar=" + boorCar + ", back=" + back + ", home=" + home + "]";
	}

	private String back;
	private String home;

	public String getBoorCar() {
		return boorCar;
	}

	public void setBoorCar(String boorCar) {
		this.boorCar = boorCar;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

}
