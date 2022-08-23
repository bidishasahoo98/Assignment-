package operator;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating scanner class
		System.out.println("Enter three numbers:");
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		if(x>y && x>z) {
			System.out.println("greatest number is: " +x);
		}
		else if(y>x && y>z) {
			System.out.println("greatest number is: " +y);
		}
		else if (z>x && z>y) {
			System.out.println("greatest number is: " +z);
		}
	}

}
