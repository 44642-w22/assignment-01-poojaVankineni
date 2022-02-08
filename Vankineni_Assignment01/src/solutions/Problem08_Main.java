package solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem08_Main {
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

		sortInArrayList(inputQueue);

	}

	private static void sortInArrayList(Queue<Integer> Q1) {
		int queueSize = Q1.size();
		ArrayList<Integer> inputArrayList = new ArrayList<>();
		ArrayList<Integer> outputArrayList = new ArrayList<>();
		for (Integer item : Q1) {
			inputArrayList.add(item);
		}

		for (int i = 0; i < queueSize / 2; i++) {
			outputArrayList.add(inputArrayList.get(queueSize - i - 1));
			outputArrayList.add(inputArrayList.get(i));
		}
		if (queueSize % 2 != 0) {
			outputArrayList.add(inputArrayList.get(queueSize / 2));
		}

		System.out.println("output :" + outputArrayList);

	}
}
