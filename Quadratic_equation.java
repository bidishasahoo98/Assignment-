package operator;

import java.util.Scanner;

public class Quadratic_equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner class
		System.out.println("Enter the value of a:");
		double a=sc.nextInt();
		System.out.println("Enter the value of b:");
		double b=sc.nextInt();
		System.out.println("Enter the value of c:");
		double c=sc.nextInt();
		// 
	    double result =( b * b) -( 4.0 * a * c);
         if (result > 0.0)// when result is positive, both roots are real and different
        	 {
               double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
               double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
               System.out.println("The roots are " + r1 + " and " + r2);
           } else if (result == 0.0) //If the value of result is zero, both roots are real and the same 
        	   {
               double r1 = -b / (2.0 * a);
               System.out.println("The root is " + r1);
           } else {
               System.out.println("The equation has no real roots.");
           }



	}

}
