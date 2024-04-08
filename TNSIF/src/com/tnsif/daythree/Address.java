package com.tnsif.daythree;

public class Address {
 
	private String street;
	private String landmark;
	private String city;
	/**
	 * @return the street
	 */
	
	
	
	
	public Address(String street, String landmark, String city) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
	}
	
	
	public Address() {
		super();
	}


	public String getStreet() {
		return street;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "" + street + ", " + landmark + "," + city + "\n";
	}
	
	
	

}
