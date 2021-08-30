package com.controlStatementd.p01;

public class Student {
	
	private String name;
	private double avarage;
	
	public Student(String name, double avarage) {
		this.name = name;
		
		if(avarage > 0.0) {
			if(avarage <=  100.0) {
				this.avarage = avarage;
			}				
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setvarage(double avarage) {
		this.avarage = avarage;
	}
	
	public double getAvatage() {
		return avarage;
	}
	
	public String getGradeLetter() {
		String gradeLetter = "";
		if(avarage >= 90.0) {
			gradeLetter = "A";
		}
		else if(avarage >= 80.0) {
			gradeLetter = "B";
		}
		else if(avarage >= 70.0) {
			gradeLetter = "C";
		}
		else if(avarage >= 60.0) {
			gradeLetter = "D";
		}
		else {
			gradeLetter = "F";
		}
		return gradeLetter;
		
	}

}
