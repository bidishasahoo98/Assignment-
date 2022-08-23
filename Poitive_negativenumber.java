package operator;

import java.util.Scanner;

public class Poitive_negativenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner class
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Number is positive");
		}
		else if(a<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}

}
