package com.coreproject2;
/*
 * 1.2Define a class Rectangle with its length and breadth. Follow the below steps,
 * a.Provide appropriate constructor(s), which gives facility of constructing Rectangle 
 *    object with default values of length and breadth as 0 or passing value of 
 *    length and breadth externally to constructor.
 * b.Provide appropriate accessor & mutator methods to Rectangle class.
 * c.Provide methods to calculate area & to display all information of Rectangle.
 * d.Design different classTestRectangle class in a separate source file, which will contain 
 *    main method.  From   this  main   method,  create  5  Rectangle  objects  by   taking  all 
 *     necessary information from the user and calculate respective area of rectangle objects and display it.
 * 
 */
public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle(){
		
	}

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int areaOfRectangle() {
		
		return getLength()*getBreadth();	
	}
    
	public int perimeterOfRectangle() {
		return 2*(getLength()*getBreadth());
	}
}
