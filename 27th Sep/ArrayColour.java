//2. Write a Java program to create a new array list, add some colors (string) and print out the collection.

package operator;

import java.util.Scanner;

public class ArrayColour {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Array size is: ");
	int size=sc.nextInt();
	String[]a=new String[size];
	for(int i=0;i<size;i++) {
		System.out.println("please enter "+ (i+1) + " th colour: ");
		a[i]=sc.next();
	}
	System.out.println("collection of colours: ");
	for(int i=0;i<size;i++)
		System.out.println(a[i]+" ");
	}}