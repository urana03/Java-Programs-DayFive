package com.bridgelabz.dayfive;

public class ThreeInteger {

	public static void main(String args[]) {
	int num[] = {15,15,-30};
    
	int sum = 0;
	
	for(int i=0; i<num.length; i++) {
		
		sum = sum + num[i];
	}
	System.out.println("The sum of three integers is: "+sum);
	System.out.print("The integers are: ");
	for(int i=0; i<num.length; i++) {
		System.out.print(num[i]+",");
	}
	}

}
