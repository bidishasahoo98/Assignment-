package com.inovation.shapes;

import java.util.Scanner;

public class Circle {
	private float radius;
	static float pi=3.5F;
	//default constructor(cons1)
	public Circle() {
		radius=1.5F;
	}
//cons2
	Circle(float redius){
		//this(10.5F,3.5F);
		this.radius=radius;
	}
	//cons 3
	public Circle(float redius,float pi) {
		//cons chaining using cons 2
		this.radius=redius;
	}
	//methods
	static float calculateCircleArea(float radius) {
		return 2*radius*radius;
	}
	static float calculateCircumference(float radius) {
		return 2* pi*radius;
	}
	public static void main(String[] args) {
		Circle obj=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius:");
		float radius=sc.nextFloat();
	
		System.out.println("Circle area is:"+calculateCircleArea(radius));
		System.out.println("Circumference is:"+calculateCircumference(radius));

	}

}
