package com.gl.PayMoney;

public class Transaction {
	
	public int isTargetAchieved(int arr[],int value) {
		
		int status = -1;
		long sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if (sum>=value) {
			    status = i+1;
				break;
			}			
		}
		
		return status;
		
	}

}
