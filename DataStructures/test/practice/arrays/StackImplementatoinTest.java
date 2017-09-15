package practice.arrays;

import org.junit.Test;

public class StackImplementatoinTest {

	StackImplementatoin stackImpl = new StackImplementatoin();
	
	@Test
	public void testPush() {
		stackImpl.push(1);
		stackImpl.push(2);
		stackImpl.push(3);
		stackImpl.push(4);
		stackImpl.push(5);
		stackImpl.push(6);
		System.out.println(stackImpl.size);
		System.out.println(stackImpl.stack);
	}
	
	@Test
	public void testPop(){
		stackImpl.push(1);
		stackImpl.push(2);
		stackImpl.push(3);
		stackImpl.push(4);
		stackImpl.push(5);
		stackImpl.push(6);
		try{
		System.out.println(stackImpl.pop());
		} catch(Exception ex){
			System.out.println("error"+ex);
		}
		System.out.println(stackImpl.size);
		System.out.println(stackImpl.stack);
		System.out.println("------------------");
		try{
			System.out.println(stackImpl.pop());
			} catch(Exception ex){
				System.out.println("error"+ex);
			}
		System.out.println(stackImpl.size);
		System.out.println(stackImpl.stack);
		System.out.println("------------------");
		try{
			System.out.println(stackImpl.pop());
		} catch(Exception ex){
			System.out.println("error"+ex);
		}
		System.out.println(stackImpl.size);
		System.out.println(stackImpl.stack);
	}

}
