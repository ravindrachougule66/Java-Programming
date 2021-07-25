package Sample;

public class Swapping_numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("before swapping a="+a+" b="+b);
		
		//using third variable
		/*
		int c=a;
		a=b;
		b=c;*/
		
		//using "+" and "-"
		/*
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20*/
		
		//using "*" and "/"
		/*
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		//using bitwise XOR
		/*
		a=a^b; //10^20=30 (1010^10100=11110)
		b=a^b; //30^20=10 (11110^10100=1010)
		a=a^b; //30^10=20 (11110^1010=10100)*/
		
		//using single expression
		
		b=a+b-(a=b); //10+20 - (a=20) =>> 30-20=10 >> b=10 and a=20
		
		
		System.out.println("after swapping a="+a+" b="+b);

	}

}

