package operator;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			//take input from user
			System.out.println("Enter any year");
			int year=input.nextInt();
			if(  year%400==0 ) {
				System.out.println("YEAR IS LEAP_YEAR");
		}else if(year%100==0 ) {
			System.out.println("YEAR IS LEAP_YEAR");
		}else if(year%4==0 ) {
			System.out.println("YEAR IS LEAP_YEAR");
		}else {
			System.out.println("YEAR IS NOT LEAP_YEAR");
	}}}
