package com.tnsif.daythree;

// Program is on "Has a " relationship implemented
public class Executor {
    public static void main(String[] args) {
    	Address a=new Address("New Mill road","near market","kurla");
    	Person p=new Person("Yash Pimpalkar", a);
    	System.out.println(p);
    }
    
}
