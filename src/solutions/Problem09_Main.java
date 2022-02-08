package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem09_Main {

	public static void main(String[] args) {
		
		Queue<Integer> queue1 = new LinkedList<>();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to enter into Queue :");
		int size = keyboard.nextInt();
		
		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			queue1.add(keyboard.nextInt());
		}
		evenOdd(queue1, size);
	}

	public static void evenOdd(Queue<Integer> queue, int size) {
		ArrayList<Integer> outputArrayList = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
		
		//Taking all elements to array list
		for (Integer item : queue) {
			inputArrayList.add(item);
		}
		
		
		Collections.reverse(inputArrayList);
		for (Integer item : inputArrayList) {
			if (item % 2 == 0) {
				even.add(item);
			} else {
				odd.add(item);
			}
		}
		
		
		int p = even.size();
		int q = odd.size();
		int maxi = Math.max(p, q);
		for (int i = 0; i < maxi; i++) {
			if (i < p) {
				outputArrayList.add(even.get(i));
			}
			if (i < q) {
				outputArrayList.add(odd.get(i));
			}
		}
		System.out.println(outputArrayList);
	}

}
