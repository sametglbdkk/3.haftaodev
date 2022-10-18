package Entities;

public class Course {
	private String language;
	private int price;
	private double time;
	
	public Course() {
	
	}
	public Course(String language, int price, double time) {
		this.language = language;
		this.price = price;
		this.time = time;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	
	
	

}
