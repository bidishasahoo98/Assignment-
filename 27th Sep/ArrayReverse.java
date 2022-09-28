//Write a Java Program to reverse the array contents.

package operator;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("original array: ");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
		}
System.out.println("after reversing : ");
for(int i=n-1;i>=0;i--) {
	System.out.println(arr[i]+" ");
		}
}}
