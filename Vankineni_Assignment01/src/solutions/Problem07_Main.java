package solutions; 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem07_Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		Queue<Integer> inputQueue = new LinkedList<>();

		int numberOfElements = 0;
		System.out.println("Enter the number of elements you want to pass on Queue");

		numberOfElements = keyboard.nextInt();
		System.out.println("Enter the Numbers : ");

		while (numberOfElements > 0) {
			inputQueue.add(keyboard.nextInt());
			numberOfElements--;
		}

		System.out.println("Input Queue : " + inputQueue);

		findEquivalentDecimalNumber(inputQueue);

	}

	private static void findEquivalentDecimalNumber(Queue<Integer> inputQueue) {
		int binaryValue = 0;

		Iterator iterator = inputQueue.iterator();

		double i = 0;
		while (iterator.hasNext()) {

			binaryValue = (int) (binaryValue + Math.pow(2, i) * inputQueue.remove());
			i++;
		}

		System.out.println("Binary value " + binaryValue);
	}
}
