package com.gl.Denominations;

public class Denominations {

	public void countDenominations(int arr[],int amount) {
		
		int[] countArray= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=amount) {
				countArray[i] = amount/arr[i];
				amount=amount%arr[i];
				if(amount==0) {
					break;
				}
			}
		}
		
		if(amount!=0) {
			System.out.println("Exact payment cannot be made");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<countArray.length;i++) {
				if(countArray[i]!=0)
			System.out.println(arr[i] + ":" + countArray[i]);
			}
		}
	}
}
