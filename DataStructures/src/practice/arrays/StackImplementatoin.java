package practice.arrays;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackImplementatoin {
	
	List<Object> stack = new ArrayList<Object>();
	int size=0;
	private int top = -1;
	
	public void push(Object val){
		stack.add(val);
		size++;
		top++;
	}
	
	public Object pop(){
		if(size==0){
			throw new EmptyStackException();
		}
		Object val = stack.get(top);
		stack.remove(top);
		top--;
		size--;
		return val;
	}
	
	

}
