package practice.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckIfLoopedTest {

	CheckIfLooped loop = new CheckIfLooped();
	
	@Test
	public void testIsLooped() {
		int nums[] = new int[]{1,2,3,4,5,6};
		Node head = loop.createList(nums);
		System.out.println(loop.isLooped(head));
//		assertTrue(loop.isLooped(head));
		assertFalse(loop.isLooped(head));
	}

}
