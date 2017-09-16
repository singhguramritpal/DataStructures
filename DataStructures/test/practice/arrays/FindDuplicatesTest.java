package practice.arrays;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindDuplicatesTest {

	FindDuplicates findDuplicates = new FindDuplicates();
	@Test
	public void testDuplicatesHashMapMethod() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,5,2,3,4,5,4,3,2,121,2,2,3,434,4);
		System.out.println(findDuplicates.duplicatesBruteForceMethod(list));
		System.out.println(findDuplicates.duplicatesHashMapMethod(list));
		System.out.println(findDuplicates.duplicatesSortMethod(list));
		
	}

}
