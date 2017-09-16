package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumInArray {
	
	public int maxSum(int nums[]){
		
		List<Integer> window = new ArrayList<Integer>();
		int sum=0;
		for(int num:nums){
			if(num>0){
				sum+=num;
				window.add(num);
			}
		}
		System.out.println(window);
		return sum;
	}
	
	public int maxContinuousSum(int nums[]){
		int sum=0;
		int tempSum=0;
		List<Integer> window = new ArrayList<Integer>();
		for(int num:nums){
			window.add(num);
			tempSum+=num;
			if(tempSum>sum){
				sum = tempSum;
				System.out.println(window);
				System.out.println(sum);
			}
			if(tempSum<0){
				tempSum=0;
				window = new ArrayList<Integer>();
			}
			
		}
		System.out.println(window);
		return sum;
	}

}
