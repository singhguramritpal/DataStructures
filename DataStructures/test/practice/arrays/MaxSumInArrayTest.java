package practice.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxSumInArrayTest {

	MaxSumInArray maxSum = new MaxSumInArray();
	
	@Test
	public void testMaxSum() {
		int nums[] = new int[]{2,3,10,0,-4,9,8,-5,6,7,0,8,0,5,-7,6,4,-7,8,3,2,0,5,8};
		System.out.println(maxSum.maxSum(nums));
	}
	
	@Test
	public void testMaxContinuousSum() {
		int nums[] = new int[]{2,3,10,0,-4,9,8,-5,6,7,0,8,0,5,-71,-7,6,4,-7,8,3,2,0,5,8};
		System.out.println(maxSum.maxContinuousSum(nums));
	}

}
