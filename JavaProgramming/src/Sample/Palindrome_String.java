package Sample;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "MADAM";
		String rev="";
		String org=rev;
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(org==rev)
		{
			System.out.println(org+" Palindrome String");
		}
		else
		{
			System.out.println(org+" is not Palindrome String");
		}
		
		

	}

}
