package solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem02_Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int elementsCount = 0;
		System.out.println("Enter the number of elements you want to pass on Linked list");

		elementsCount = keyboard.nextInt();

		System.out.println("Enter the Elements :");
		LinkedList<Integer> inputLinkedList = new LinkedList<>();

		while (elementsCount > 0) {
			inputLinkedList.add(keyboard.nextInt());
			elementsCount--;
		}
		int k = 0;
		System.out.println("Enter the number(k) : ");
		k = keyboard.nextInt();
		
		countinuousPair(inputLinkedList,k);

	}

	private static void countinuousPair(LinkedList<Integer> inputLinkedList, int k) {
		ArrayList<Integer> outputArrayList;

		LinkedList<ArrayList<Integer>> outputLinkedList = new LinkedList<>();
		
		for (int x = 0; x < inputLinkedList.size() - 1; x++) {
			outputArrayList = new ArrayList<>();
			if ((inputLinkedList.get(x) + inputLinkedList.get(x + 1)) == k) {

				outputArrayList.add(inputLinkedList.get(x));
				outputArrayList.add(inputLinkedList.get(x + 1));

				outputLinkedList.add(outputArrayList);
			}

		}
		System.out.println("Output :" + outputLinkedList);
		
	}

}
