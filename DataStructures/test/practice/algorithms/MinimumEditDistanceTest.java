package practice.algorithms;

import org.junit.Test;

public class MinimumEditDistanceTest {

	MinimumEditDistance editDistance = new MinimumEditDistance();
	@Test
	public void testMinimumEditDitanceDP() {
		int dis = editDistance.minimumEditDitanceDP("execution","intention");
		System.out.println(dis);
	}
	@Test
	public void testMinimumEditDitance() {
		int dis = editDistance.minimumEditDistance("execution","intention");
		System.out.println(dis);
	}
}
