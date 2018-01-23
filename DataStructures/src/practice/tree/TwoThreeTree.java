package practice.tree;

public class TwoThreeTree {
	
	Node root;
	Node parent;
	Node child;
	
	public void insert(int val){
		
		if(root == null){
			root = new Node(val, null);
			parent = root;
		}
		
		if(parent.a!=null && parent.b == null){
			if(val < parent.a){
				if(parent.left == null){
					parent.left = new Node(val, null);
				} else{
					if(parent.left.b == null){
						if(val < parent.left.a){
							parent.left = new Node(val, parent.left.a);
						} else {
							parent.left = new Node(parent.left.a, val);
						}
					} else{
						
						int a = parent.left.a;
						int b = parent.left.b;
						if(val > b){
							if(parent.b == null){
								parent = new Node(val, parent.a);
							} else{
								
							}
						}
						
					}
				}
			}
			else if(parent.a!=null && val > parent.a){
				if(parent.right == null){
					parent.right = new Node(val, null);
				}
			}
		}
		
	}
	
	
}

class Node{
	
	Node left;
	Node middle;
	Node right;
	
	Integer a,b;
	
	public Node(Integer a, Integer b){
		this.a = a;
		this.b = b;
	}
	
}
