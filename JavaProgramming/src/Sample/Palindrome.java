package Sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num = sc.nextInt();
		int ori_num=num;
		int rev=0;
		while(num!=0)
		{
			rev = rev*10 +num%10;
			num=num/10;
		}
		
		if(ori_num==rev)
		{
			System.out.println(ori_num+" Palindrome Number");
		}
		else
		{
			System.out.println(ori_num+" is not Palindrome Number");
		}

	}

}
