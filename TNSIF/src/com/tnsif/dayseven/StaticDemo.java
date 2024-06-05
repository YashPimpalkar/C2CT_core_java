package com.tnsif.dayseven;

public class StaticDemo {
   static int serialNo;
   int section;
   
   static {
	   System.out.println("I am static block");
	   serialNo=1000;
   }
   
   public StaticDemo() {
	   System.out.println("I am default constructor block");
	   section++;
	   serialNo++;
	   
   }

@Override
public String toString() {
	return "StaticDemo [section=" + section + ", SerialNo=" + serialNo + "]";
}
   static void display() {
	   System.out.println("Serial No:"+serialNo );
   }
   
}
