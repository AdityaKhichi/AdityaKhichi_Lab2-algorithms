package com.gl.Denominations.Driver;

import com.gl.Denominations.Denominations;
import com.gl.Denominations.Sort.MergeSort;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		MergeSort merge= new MergeSort();
		merge.sort(arr, 0, num-1);			
		
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		Denominations count = new Denominations();
		count.countDenominations(arr, amount);
		
		sc.close();
		
	}
}


