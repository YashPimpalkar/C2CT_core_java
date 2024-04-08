package com.tnsif.org;

public class Customer {
    private int customerID;
    private String customerName;
    private String cutomerCity;
	
    public Customer(int customerID, String customerName, String cutomerCity) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.cutomerCity = cutomerCity;
	}
    public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCutomerCity() {
		return cutomerCity;
	}
	public void setCutomerCity(String cutomerCity) {
		this.cutomerCity = cutomerCity;
	}
    
    
}
