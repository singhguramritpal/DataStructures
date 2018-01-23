package practice.algorithms;

import java.util.Scanner;


public class StackCalculator {
		
	void push(double x) {
		StackImpl.insert(x);
		StackImpl.print();
	}
	
	double pop() {
	return StackImpl.pop();
	}
	
	double add() {
		if(StackImpl.size ==1){
			return pop();
		}
		double temp1 = pop();
		System.out.println(temp1);
		double temp2 = pop();
		System.out.println(temp2);
		double Result = temp1 + temp2;
		push(Result);
		System.out.println("The result is: " + Result);
		StackImpl.print();
	return Result;
	}
	
	double subtract() {
		if(StackImpl.size ==1){
			return pop();
		}
		double temp1 = pop();
		double temp2 = pop();
		double Result = temp1 - temp2;
		push(Result);
		System.out.println("The result is: " + Result);
		StackImpl.print();
	return Result;
	}
	
	double multiply() {
		if(StackImpl.size ==1){
			return pop();
		}
		double temp1 = pop();
		double temp2 = pop();
		double Result = temp1 * temp2;
		push(Result);
		System.out.println("The result is: " + Result);
		StackImpl.print();
	return Result;
	}
	
	double divide() {
		if(StackImpl.size ==1){
			return pop();
		}
		double temp1 = pop();
		double temp2 = pop();
		double Result = temp1 / temp2;
		push(Result);
		System.out.println("The result is: " + Result);
		StackImpl.print();
	return Result;
	}
	
	/*
	void clear() {
		
	}
	
	double[] getValues() {
		
	}
	
	int size() {
		
	}
	*/
	public static void main(String[] args) {
		System.out.println("Welcome to the Stack Calculator. \n");
		System.out.println("Commands: push n, add, sub, mult, div, clear, or quit.\n");
		StackCalculator stackcalculator = new StackCalculator();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("? ");
			choice = sc.nextLine();
			String [] arrOfStr = choice.split(" ");
			if(arrOfStr[0].equalsIgnoreCase("Push")) {
				stackcalculator.push(Double.parseDouble(arrOfStr[1]));
				choice = "y";
			} else if (arrOfStr[0].equalsIgnoreCase("Mult")) {
				stackcalculator.multiply();
				choice = "y";
			} else if (arrOfStr[0].equalsIgnoreCase("div")) {
				stackcalculator.divide();
				choice = "y";
			} else if (arrOfStr[0].equalsIgnoreCase("add")) {
				stackcalculator.add();
				choice = "y";
			} else if (arrOfStr[0].equalsIgnoreCase("sub")) {
				stackcalculator.subtract();
				choice = "y";
			} else if (arrOfStr[0].equalsIgnoreCase("quit")) {
				choice = "n";
			}	else{
				System.out.println("Please enter the right choice");
				choice = "y";
			}
		}		
	}
}
