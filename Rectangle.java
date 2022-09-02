package com.cognizant.shapes;
class AreaCalculator{
	
	void calculateArea() {
		System.out.println("The Area of the rectangle is calculated using the formula length*bradth");
	}
}
public class Rectangle {

	public static void main(String[] args) {
		 AreaCalculator area = new  AreaCalculator();
		 area.calculateArea();
	}

}
