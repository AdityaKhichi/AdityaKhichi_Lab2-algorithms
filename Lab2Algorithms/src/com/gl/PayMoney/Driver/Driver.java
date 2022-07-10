package com.gl.PayMoney.Driver;

import java.util.Scanner;
import com.gl.PayMoney.Transaction;

public class Driver {
     
	public static void main(String[] args) {	
		
		
		Scanner sc = new Scanner(System.in);
		Transaction transactions=new Transaction();
				
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int [] transactionArr = new int [size];
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter transaction value " +(i+1));
			transactionArr[i]=sc.nextInt();			
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target = sc.nextInt();
		 
		for(int j=0;j<target;j++) {
			System.out.println("Enter the value of target");
			int t1=sc.nextInt();
			int transactionNumber=transactions.isTargetAchieved(transactionArr,t1);
			if(transactionNumber==-1) {
				System.out.println("Given target is not achieved");
			}
			else {
				System.out.println("Target Achieved after " +transactionNumber+" transactions");				
			}
		}		
		
		sc.close();
				
	}

}
