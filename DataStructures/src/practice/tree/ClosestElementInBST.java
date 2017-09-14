package practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ClosestElementInBST {
	
	public int getClosest(int val, TreeNode root){
		int result = val;
		int min = Integer.MAX_VALUE;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(q.size()!=0){
			TreeNode temp = q.poll();
			if(Math.abs(val-temp.val) < min){
				min = Math.abs(val-temp.val);
				result = temp.val;
			}
			
			if(temp.left != null){
				q.offer(temp.left);
			}
			if(temp.right != null){
				q.offer(temp.right);
			}
		}
		
		return result;
	}

}
