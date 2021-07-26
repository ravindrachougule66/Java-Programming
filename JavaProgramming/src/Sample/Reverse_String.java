package Sample;

public class Reverse_String {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String :");
		String str = "ABCD";
		String rev ="";
		/*
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		//char array
		/*
		char a[] = str.toCharArray();
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}*/
		
		// String buffer class
		
		StringBuffer sb = new StringBuffer(str);		
		System.out.println(sb.reverse());
	}

}
