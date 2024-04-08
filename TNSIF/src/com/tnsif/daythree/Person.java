package com.tnsif.daythree;

public class Person {
    private String name;
    private String gender;
    private String age;
    private Address address;
    
    
    
    public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	public Person() {}
    
    
	public Person(String name, String gender, String age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "name=" + name + ",\naddress=" + address + "";
	}
    
	
	
	
    
}
