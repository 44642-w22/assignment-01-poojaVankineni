package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem03_Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int elementsCount = 0;
		System.out.println("Enter the number of elements you want to pass on Array List");

		elementsCount = keyboard.nextInt();
		ArrayList<Integer> inputArrayList = new ArrayList<>();

		System.out.println("Enter the Elements :");
		while (elementsCount > 0) {
			inputArrayList.add(keyboard.nextInt());
			elementsCount--;
		}
		
		findMax(inputArrayList);

	}

	private static void findMax(ArrayList<Integer> inputArrayList) {

		int maxValue = Integer.MIN_VALUE;
		
		for (Integer value : inputArrayList) {
			if (value > maxValue) {
				maxValue = value;
			}
		}
		
		System.out.println("Output : "+ maxValue );

	}

}