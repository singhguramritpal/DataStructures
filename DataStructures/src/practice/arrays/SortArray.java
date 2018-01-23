package practice.arrays;

public class SortArray {
	
	public int[] quickSort(int nums[], int start, int end){
		
		int pivot = end+1;
		
		while(start<end){
			if(nums[start] > nums[pivot] && nums[end] < nums[pivot]){
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				end--;
				start++;
			}
			else if(nums[start] > nums[pivot] && nums[end] > nums[pivot]){
				end--;
			} else if(nums[start] < nums[pivot] && nums[end] < nums[pivot]){
				start++;
			} else if(nums[start] < nums[pivot] && nums[end] > nums[pivot]){
				end--;
				start++;
			}
		}
		
		int temp = nums[start];
		nums[start] = nums[pivot];
		nums[pivot] = temp;
		
		if(pivot>0 && pivot <nums.length){
			quickSort(nums, 0, end-1);
			quickSort(nums, start, pivot-1);
		}
		return nums;
	}

}
