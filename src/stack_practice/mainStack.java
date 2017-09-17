package stack_practice;

import java.util.Scanner;

public class mainStack {
	public static char[][] set = { { '[', ']' }, { '(', ')' }, { '{', '}' } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_tc = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n_tc; i++) {
			char[] input = sc.nextLine().toCharArray();

			if (matcher(input))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean matcher(char[] arr) {
		myStack stack = new myStack();

		for (int i = 0; i < arr.length; i++) {
			if(isOpen(arr[i]))
				stack.push(arr[i]);
			else {
				if (!isMatching(arr[i], stack))
					return false;
			}
		}

		if (stack.getCount() == 0)
			return true;
		else
			return false;

	}

	public static boolean isOpen(char ch) {
		for (int i = 0; i < set.length; i++)
			if (set[i][0] == ch)
				return true;

		return false;
	}

	public static boolean isMatching(char input, myStack ms) {
		char popVal = (char) ms.pop();

		for (int i = 0; i < set.length; i++)
			if ((set[i][1] == input) && (set[i][0] == popVal))
				return true;

		return false;
	}

}

