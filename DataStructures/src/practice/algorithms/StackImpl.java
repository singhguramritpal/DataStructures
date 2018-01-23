package practice.algorithms;

public class StackImpl {
	
	
	static Node root;
	static Node node;
	static int size = 0;
	
	public static void insert(double val) {
		
		if(node == null) {
			node = new Node(val);
			root = node;
			size++;
			return;
		}
		Node tempNode = node;
		
		node.next = new Node(val);
		node = node.next;
		node.prev = tempNode;
		size++;
	}
	
	public static  double pop() {
		
		if(size == 0) {
			throw new IndexOutOfBoundsException();
		}
		double val = node.val;
		if(size==1){
			node = null;
			size--;
			return val;
		}
		node = node.prev;
		node.next = null;
		size--;
		return val;
	}
	
	public static void print() {
		Node current = node;
		boolean arrow = true;
		
		System.out.println("");
		System.out.println("");
		do {
			//System.out.print((arrow)?"|"+ current.val + "|":"<-->"+"|"+ current.val 
			//		+"|" );
			System.out.println("| "+current.val+" |");
			System.out.println("-------");
			arrow = false;
			current = current.prev;	
		}while(current!=null);
		
		System.out.println("Size of the Stack is: "+size);
	}

	/*public static void main(String[] args) {
		
		insert(20);
		insert(21);
		insert(22);
		insert(23);
		insert(24);
		insert(25);
		insert(26);
		print();
		System.out.println(pop() + " :deleted");
		print();
		System.out.println(size);
		System.out.println(pop() + " :deleted");
		print();
		System.out.println(pop() + " :deleted");
		print();
		System.out.println(size);
	}*/
	
}

class Node{
	//pointers
	Node next;
	Node prev;
	//the actual data
	double val;
	
	public Node(double val) {
		this.val = val;
	}
	
}