package practice.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindComplementOfListTest {

	FindComplementOfList complement;
	
	@Test
	public void testFindComplement() {
		complement = new FindComplementOfList();
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			int num = (int) (Math.random()*10);
			list1.add(num);
			num = (int) (Math.random()*10);
			list2.add(num);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(complement.findComplement(list1, list2));
	}

}
