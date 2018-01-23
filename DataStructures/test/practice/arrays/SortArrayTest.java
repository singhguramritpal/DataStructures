package practice.arrays;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayTest {

	SortArray sort = new SortArray();
	
	@Test
	public void testQuickSort() {
		int nums[] = new int[]{6,3,4,9,2,1,5,8,7,0};
		
		for(int num:nums){
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println();
		nums = sort.quickSort(nums, 0, nums.length-2);
//		System.out.println(Arrays.asList(nums).size());
		for(int num:nums){
			System.out.print(num+", ");
		}
	}

}
