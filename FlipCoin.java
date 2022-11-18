package com.bridgelabz.dayfive;
import java.util.Scanner;
import java.util.Random;

public class FlipCoin {

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of times to flip: ");
		int n = scan.nextInt();
		
		
		int percentHeads;
		int percentTails;
		
		int count1 = 0;//for head;
		int count2 = 0;//for tail;
		
		for(int i=1; i<=n; i++) {
			Random  ran = new Random();
			int check = ran.nextInt(2);
			
			if(check == 1) {
				count1= count1 + 1;
			}
			else {
				count2= count2 + 1;
			}
			
			
		}
		percentHeads = (count1/n)*100;
		
		percentTails = (count2/n)*100;
		
		System.out.println("Percentage of Heads: "+percentHeads);
		System.out.println("Percentage of Tails: "+percentTails);
		scan.close();
		
	}
}
