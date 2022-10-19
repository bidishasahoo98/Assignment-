package operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatch {

	public static void main(String[] args) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter x value: ");
				int x=sc.nextInt();
				System.out.println("Enter y value: ");
				int y=sc.nextInt();
				System.out.println((x/y));
			}catch(ArithmeticException e) {
				System.out.println( "java.lang.ArithmeticException: / by zero" );
			}catch(InputMismatchException e) {
				System.out.println( " java.util.InputMismatchException ");
			}
		}}