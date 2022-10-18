package Entities;

public class instructor {
	private String name;
	private String lastName;
	private double yearsofexperience;
	private String language;
	
	public instructor() {
		
	}

	public instructor(String name, String lastName, double yearsofexperience, String language) {
		this.name = name;
		this.lastName = lastName;
		this.yearsofexperience = yearsofexperience;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getYearsofexperience() {
		return yearsofexperience;
	}

	public void setYearsofexperience(double yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	
	
	
	
	

}
