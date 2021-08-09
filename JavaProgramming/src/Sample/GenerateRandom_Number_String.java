package Sample;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandom_Number_String {

	public static void main(String[] args) {
		//using Random class
		/*
		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
		System.out.println(rand_int);
		
		double rand_double = rand.nextDouble();
		System.out.println(rand_double);
		*/
		//using Math class
		//System.out.println(Math.random());
		
		//Apache common lang API
		
		String rand = RandomStringUtils.randomNumeric(5);
		System.out.println(rand);

	}

}
