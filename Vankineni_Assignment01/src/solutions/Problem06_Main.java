package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem06_Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Stack<Integer> inputStack = new Stack<>();

		int numberOfElements = 0;
		System.out.println("Enter the number of elements you want to pass on Stack");

		numberOfElements = Integer.parseInt(keyboard.nextLine());

		System.out.println("Enter the number for stack :");
		while (numberOfElements > 0) {
			inputStack.push(keyboard.nextInt());
			numberOfElements--;
		}

		performLIFOFIFO(inputStack);
	}

	private static void performLIFOFIFO(Stack<Integer> inputStack) {
		ArrayList<Integer> outputArray = new ArrayList<>(inputStack.size());

	
		for (int i = 0; i <= inputStack.size()/2; i++) {
				outputArray.add(inputStack.pop());
		}
		
		for(int i=0;i < inputStack.size() ;i++) {
			outputArray.add(inputStack.get(i));
		}
		System.out.println(outputArray);
	}
}
