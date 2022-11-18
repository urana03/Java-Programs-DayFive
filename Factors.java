package com.bridgelabz.dayfive;
import java.util.*;

public class Factors {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
		int count=0;
		int num=0;
		
		System.out.println("Prime factors of number are:");
		for(int i=2; i<=n; i++) {
			if(n%i == 0) {
				for(int j=2; j<=i; j++) {
					if(i%j == 0) {
						count++;
					}
					
				}
			}
			if(count == 1)
				num=i;
				System.out.print(num+" ");
		}
		scan.close();
	}
}
