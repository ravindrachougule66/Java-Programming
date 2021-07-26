package Sample;

public class Number_Digit_Count {

	public static void main(String[] args) {
		
		int num = 123452;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits: "+count);

	}

}
