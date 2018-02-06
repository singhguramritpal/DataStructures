package practice.tree;

import org.junit.Test;

public class SearchForElementTest {
	
	Tree tree;
	SearchForElement search = new SearchForElement();

	@Test
	public void testIsPresent() {
		tree = new Tree();
		int vals[] = new int[]{5,3,2,1,7,6,8};
		TreeNode root = tree.createBinarySearchTree(vals);
		System.out.println(search.isPresent(root, 5));
		System.out.println(search.isPresent(root, 7));
		System.out.println(search.isPresent(root, 9));
		System.out.println(search.isPresent(root, 2));
	}
	
	@Test
	public void testIsPresentNoRecursion() {
		tree = new Tree();
		int vals[] = new int[]{5,3,2,1,7,6,8};
		TreeNode root = tree.createBinarySearchTree(vals);
		System.out.println(search.isPresentNoRecursion(root, 5));
		System.out.println(search.isPresentNoRecursion(root, 7));
		System.out.println(search.isPresentNoRecursion(root, 9));
		System.out.println(search.isPresentNoRecursion(root, 2));
	}

}
