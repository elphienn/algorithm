/**
 * Josephus Problem
 *
 * People are standing in a circle waiting to be executed.
 * Counting begins at a specified point in the circle and proceeds around the circle in a specified direction.
 * After a specified number of people are skipped, the next person is executed.
 * The procedure is repeated with the remaining people, starting with the next person, going in the same direction and skipping the same number of people, until only one person remains, and is freed.
 *
 * The problem — given the number of people, starting point, direction, and number to be skipped — is to choose the position in the initial circle to avoid execution.
 *
 * elphienn@gmail.com
 */

package array_pracitce;

import java.util.ArrayList;
import java.util.Scanner;

public class josephus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_tc = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n_tc; i++) {
			String input = sc.nextLine();
			String[] arr = input.split(" ");
			int n_candidates = Integer.parseInt(arr[0]);
			int next = Integer.parseInt(arr[1]);

			// Requirements
			if ((n_candidates > 1000) || next > 3)
				System.exit(1);

			ArrayList<Integer> ar = new ArrayList<Integer>();
			for (int j = 0; j < n_candidates; j++)
				ar.add(j + 1);

			int count = 0;
			while (ar.size() > 2) {
				ar.remove(count); //Remove first candidate
				count = (count + next - 1) % ar.size();
			}

			System.out.println(ar);

		}

	}

}
