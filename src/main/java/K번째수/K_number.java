package main.java.K번째수;

import java.util.ArrayList;

public class K_number {
	int array[] = { 1, 5, 2, 6, 3, 7, 4 };
	int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

	public static void main(String[] args) {
		K_number a = new K_number();
		// 결과가 몇개인지.

		int i;
		// 결과 갯수만큼 돌리기
		for (i = 0; i < a.commands.length; i++) {
			int first = a.commands[i][0] - 1;
			int last = a.commands[i][1] - 1;
			int pick = a.commands[i][2] - 1;
			for (int x = first; x <= last; x++) {
				System.out.print(a.array[x]);
			}
			System.out.println("");

		}
	}
}
