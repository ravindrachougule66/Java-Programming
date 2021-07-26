package Sample;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String str = sc.next();
		String org=str;
		String rev="";
		
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(org.equals(rev))
		{
			System.out.println(org+" is Palindrome String");
		}
		else
		{
			System.out.println(org+" is not Palindrome String");
		}
		
		

	}

}
