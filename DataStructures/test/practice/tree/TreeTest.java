package practice.tree;

import org.junit.Test;

import practice.tree.Tree;
import practice.tree.TreeNode;

public class TreeTest {

	Tree tree;
	
	@Test
	public void testCreateBinarySearchTree() {
		tree = new Tree();
		int vals[] = new int[]{5,3,2,1,7,6,8};
		TreeNode root = tree.createBinarySearchTree(vals);
		TreeNode temp1 = root;
		TreeNode temp2 = root; 
		tree.inOrderTraversal(temp1);
		System.out.println("--------------------");
		tree.preOrderTraversal(temp2);
		System.out.println("--------------------");
		tree.postOrderTraversal(root);
	}

}
