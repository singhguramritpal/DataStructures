package practice.tree;

public class Tree {
	
	public TreeNode createBinarySearchTree(int []vals){
		
		TreeNode root = new TreeNode(vals[0]);
		
		TreeNode temp = root;
		
		for(int val:vals){
			addBSTNode(temp, val);
		}
		
		return root;
	}
	
	public void addBSTNode(TreeNode root, int val){
		
		TreeNode temp = root;
		while(root!=null){
			temp = root;
			if(val < root.val){
				root = root.left;
			} else{
				root = root.right;
			}
		}
		
		if(val < temp.val){
			temp.left = new TreeNode(val);
		} else{
			temp.right = new TreeNode(val);
		}
		
	}
	
	public void inOrderTraversal(TreeNode root){
		if(root!=null){
			inOrderTraversal(root.left);
			System.out.println(root.val);
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(TreeNode root){
		if(root!=null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.val);
		}
	}
	
	public void preOrderTraversal(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public static void main(String args[]){
		
	}

}
