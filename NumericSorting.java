package com.arrays.demo;

import java.util.Scanner;

public class NumericSorting {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
	int nums[] = new int[8];
			
		
		System.out.println("Enter " + nums.length + " values: ");
		for(int i=0; i<nums.length; i++) 
			nums[i] = scanner.nextInt();
		// before sorting
		
		System.out.println("Values before sorting: ");
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
		// descending order
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println("Values after sorting in descending order:");
			for(int i=0; i<nums.length; i++)
					System.out.println(nums[i]);
			
			
			// ascending order
			
			
			for(int i=0; i<nums.length; i++) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i] > nums[j]) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
			
			System.out.println("Values after sorting in ascending order:");
			for(int i=0; i<nums.length; i++)
				System.out.println(nums[i]);
		
		
		scanner.close();
	
    }

}
