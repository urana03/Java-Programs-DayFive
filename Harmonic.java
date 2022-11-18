package com.bridgelabz.dayfive;
import java.util.*;

public class Harmonic {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int n = scan.nextInt();
		
		double num = 0.0;
		
		System.out.println("The harmonic series is:");
		
		for(int i=n; i>0; i-- ) {
			
			num = num + (double)1/i;
			System.out.print(num+",");
		}
		scan.close();
	}
}
