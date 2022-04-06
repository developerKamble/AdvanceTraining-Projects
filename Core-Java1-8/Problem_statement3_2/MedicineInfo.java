package com.coreproject2;
/*
 * Create an interface MedicineInfo to represent a drug manufactured by a pharmaceutical company. 
 * Provide  an  abstract method displayLabel()  in  this interface to  print  Name  and  address of 
 *  the company.
 *  Do following tasks,
 * •Implement MedicineInfo interface with Tablet, Syrup and Ointment classes.
 * •Override the displayLabel() method in each of these classes to print information suitable to the
 *  type of medicine. 
 *  For example, in case of tablets, it could be “store in a cool dry place”, 
 *               in case of ointments it could be “for external use only” etc.
 *  Create a class TestMedicine . Write main function to do the following:
 *  •Declare an array of Medicine references of size 10.
 *  •Create a medicine object of the type as decided by a randomly generated integer in the 
 *  range 1 to 3. (Refer Java API Documentation to find out random generation feature.)
 * •Check the polymorphic  behavior of the displayLabel() method.
 * */

public interface MedicineInfo {
	abstract void displayLabel();

}
