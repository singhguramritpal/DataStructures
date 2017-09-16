package practice.linkedlist;

public class CheckIfLooped {
	
	public boolean isLooped(Node root){
		Boolean isLoop = false;
		
		Node slow = root;
		Node fast = root.next.next;
		
		while(slow!=null && fast!=null && fast.next != null){
			if(slow == fast){
				isLoop = true;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return isLoop;
	}
	
	public Node createList(int nums[]){
		Node first = new Node(nums[0]);
		Node root = first;
		
		for(int num:nums){
			root.next = new Node(num);
			root = root.next;
		}
//		root.next = first;
		return first;
	}

}
