package practice.algorithms;

import org.junit.Test;

public class MinimumEditDistanceTest {

	MinimumEditDistance editDistance = new MinimumEditDistance();
	@Test
	public void testMinimumEditDitanceDP() {
		int dis = editDistance.minimumEditDitanceDP("execution","intention");
		System.out.println(dis);
	}

}
