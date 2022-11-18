package com.bridgelabz.dayfive;
import java.util.*;

public class Swap {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp;
		
		System.out.println("The number before swapping are: "+a +" "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The numbers after swapping are :"+a+ " "+b);
		
		scan.close();
	}
}
