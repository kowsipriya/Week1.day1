package Week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] datas = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(datas);
		System.out.println("Second Largest value is " + datas[datas.length - 2]);

	}
}
