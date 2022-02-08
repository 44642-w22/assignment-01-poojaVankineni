package solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem10_Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Deque<Character> inputQueue = new LinkedList<>();

		int numberOfElements = 0;
		System.out.println("Enter the number of elements you want to pass on Queue");
		numberOfElements = keyboard.nextInt();

		System.out.println("Enter the elements : ");

		while (numberOfElements > 0) {
			inputQueue.addFirst(keyboard.next().charAt(0));
			numberOfElements--;
		}

		System.out.println("Enter the number of operations : ");

		int numberOfOperations = keyboard.nextInt();

		int[] inputArray = new int[numberOfOperations];

		System.out.println("Enter the operations : ");
		for (int i = 0; i < numberOfOperations; i++) {
			inputArray[i] = keyboard.nextInt();
		}

		performOperations(inputQueue, inputArray);
	}

	private static void performOperations(Deque<Character> queue, int[] array) {

		String outputString = "";
		char lastChar = ' ';

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 1) {
				lastChar = queue.removeLast();
			} else if (array[i] == 0) {
				queue.addLast(lastChar);
			}

		}

		int queueSize = queue.size();

		for (int i = 0; i < queueSize; i++) {
			outputString = outputString + queue.removeLast();
		}

		System.out.println("Output : " + outputString);

	}

}

