package com.tnsif.dayseven;

public class Employee {
   private String name;
   private int id;
   static private String companyName="TSNIF";
public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", companyName=" + companyName + "]";
}
   
 
}
