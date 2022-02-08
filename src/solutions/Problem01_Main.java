package solutions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem01_Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int elementsCount = 0;
		System.out.println("Enter the number of elements you want to pass on Linked list");

		elementsCount = keyboard.nextInt();

		System.out.println("Enter the elements : ");
		LinkedList<Integer> inputLinkedList = new LinkedList<>();
		LinkedList<Integer> outputLinkedList = new LinkedList<>();

		while (elementsCount > 0) {
			inputLinkedList.add(keyboard.nextInt());
			elementsCount--;
		}

		Iterator<Integer> listIterator = inputLinkedList.iterator();

		while (listIterator.hasNext()) {
			int value = listIterator.next();
			if (isPerfect(value)) {
				outputLinkedList.add(value);
			}
		}
		System.out.println("Output : " + outputLinkedList);
		 
	}

	private static boolean isPerfect(int value) {
		int sumOfValues = 0;
		for (int p = 1; p <= value / 2; p++) {
			if (value % p == 0) {
				sumOfValues = sumOfValues + p;
			}
		}
		if (sumOfValues == value) {
			return true;
		}
		return false;
	}
}
