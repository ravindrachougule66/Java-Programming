package Sample;

public class CountOf_EvenAndOdd {

	public static void main(String[] args) {
		
		int num = 12345;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			int num2=num%10;
			if(num2%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		
		System.out.println("Count of Even: "+even+" and Count of Odd: "+odd);

	}

}
