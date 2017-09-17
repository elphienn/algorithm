package sort_practice;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[] input = { 22, 50, 17, 25, 18, 32, 33, 44, 29, 8 };
		System.out.println(Arrays.toString(selectionSorting(input)));
	}

	public static int[] selectionSorting(int[] input) {
		int min = 1000;
		int count = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[j] < min) {
					min = input[j];
					count = j;
				}
			}
			input[count] = input[i];
			input[i] = min;
			min = 1000;
		}
		return input;
	}

}
