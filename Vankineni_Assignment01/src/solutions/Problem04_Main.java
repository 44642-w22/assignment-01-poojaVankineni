package solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04_Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int elementsCount = 0;
		System.out.println("Enter the number of elements you want to pass on Array list : ");

		elementsCount = Integer.parseInt(keyboard.nextLine());

		System.out.println("Enter the Elements : ");

		ArrayList<String> inputArrayList = new ArrayList<>();

		while (elementsCount > 0) {
			inputArrayList.add(keyboard.nextLine());
			elementsCount--;
		}

		sortArrayStrings(inputArrayList);

	}

	private static void sortArrayStrings(ArrayList<String> inputArrayList) {
		
		String tempString = "";
		
		for (int i = 0; i < inputArrayList.size(); i++) {
			for (int j = 0; j < inputArrayList.size(); j++) {
				if (inputArrayList.get(i).length() < inputArrayList.get(j).length()) {
					tempString = inputArrayList.get(i);
					inputArrayList.set(i, inputArrayList.get(j)); 
					inputArrayList.set(j, tempString); 
				}
			}
		}
		System.out.println("Output : " + inputArrayList);
	}
}
