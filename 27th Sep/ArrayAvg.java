//1. Java Program to find average of an int Array.



package operator;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int sum=0;
		int avg = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int arrayLength=sc.nextInt();
		
		int []a=new int [arrayLength];  //initialize declare and object creation
		 for(int i=0;i<arrayLength;i++) {
			 System.out.println("Enter index"+(i+1)+" : ");
			 a[i]=sc.nextInt();}
		 for(int i=0;i<a.length;i++) {
		    	 sum=sum+a[i];
		         avg=(sum/a.length);
		    		}
		 System.out.println("array elements sum:" +sum);
	    	System.out.println("average of an int Array:" +avg);
}}


