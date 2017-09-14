package practice.tree;

import org.junit.Test;

public class ClosestElementInBSTTest {

	Tree tree;
	ClosestElementInBST closest;
	
	@Test
	public void testGetClosest() {
		tree = new Tree();
		closest  = new ClosestElementInBST();
		int vals[] = new int[]{15,7,11,3,33,20,57};
		TreeNode root = tree.createBinarySearchTree(vals);
		System.out.println(closest.getClosest(17, root));
	}

}
