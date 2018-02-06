package practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchForElement {
	
	public boolean isPresent(TreeNode node, int data){
		if(node != null){
			
			if(node.val == data){
				return true;
			} else{
				return isPresent(node.left, data) || isPresent(node.right, data);
			}
		}
		return false;
	}
	
	public boolean isPresentNoRecursion(TreeNode node, int data){
		
		if(node!=null){
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			
			q.add(node);
			
			while(!q.isEmpty()){
				TreeNode elem = q.poll();
				if(elem.val == data){
					return true;
				}
				if(elem.left!=null){
					q.add(elem.left);
				}
				if(elem.right != null){
					q.add(elem.right);
				}
			}
		}
		return false;
		
	}

}
