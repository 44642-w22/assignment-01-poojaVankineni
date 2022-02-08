package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem05_Main {

	public static void main(String[] args) { 

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the input String Pattern : ");

		String inputString = keyboard.nextLine();

		validateBraces(inputString);
	}

	private static void validateBraces(String inputString) {
		boolean isValid = true;
		ArrayList<Character> openBracesList = new ArrayList<>();
		openBracesList.add('(');
		openBracesList.add('[');
		openBracesList.add('{');

		Stack<Character> charStack = new Stack<>(); 

		for (int i = 0; i < inputString.length(); i++) {

			if (openBracesList.contains(inputString.charAt(i))) {
				charStack.push(inputString.charAt(i));

			} else {
				char peekedElement;
				if (charStack.size() > 0) {
					peekedElement = charStack.peek();
				} else {
					isValid = false;
					break;
				}

				if (charStack.size() > 0 && (peekedElement == '{' && inputString.charAt(i) == '}'
						|| peekedElement == '(' && inputString.charAt(i) == ')'
						|| peekedElement == '[' && inputString.charAt(i) == ']')) {
					charStack.pop();
				} else {
					isValid = false;
					break;
				}
			}
		}

		if (isValid && charStack.isEmpty())
			System.out.println("Output : True");
		else
			System.out.println("Output : False");

	}
}