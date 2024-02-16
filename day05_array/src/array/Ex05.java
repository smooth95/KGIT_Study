package array;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		int arr [][] = new int[][] {
			{10,  20,  30, 3},
			{40,  50,  60, 4},
			{70,  80,  90, 5}
		};
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				System.out.print (arr[i][j] + "   ");
			}
			System.out.println("---------------");
		}
	}
}
