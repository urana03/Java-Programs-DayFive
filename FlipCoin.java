package com.bridgelabz.dayfive;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of times to flip: ");
		int n = scan.nextInt();
		double ran = 0.0;
		int count=1;
		
		
		int heads = 0;//for head;
		int tails = 0;//for tail;
		
		while(count <= n) {
			ran = Math.random();
			System.out.println(ran);
			
			if(ran>0.5) {
				tails++;
			}
			else {
				heads++;
			}
			
			count++; 
		}
	 double	percentHeads = (double)(heads/n)*100;
		
	 double	percentTails = (double)(tails/n)*100;
		
		System.out.println("Percentage of Heads: "+percentHeads);
		System.out.println("Percentage of Tails: "+percentTails);
		scan.close();
		
	}
}
