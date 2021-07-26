package Sample;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a=scan.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=scan.nextInt();
		
		System.out.println("Enter Third Number: ");
		int c=scan.nextInt();
		
		/*
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}*/
		
		//ternary operator
		
		int larg = a>b?a:b;
		larg = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(larg+ " is largest number");

	}

}
