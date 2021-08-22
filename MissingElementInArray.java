package Week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
	int[] array = {1,2,3,4,7,6,8};
	Arrays.sort(array);
	
	for (int i = array[0]; i < array.length; i++) {
		if (array[i-1] != i) {
			System.out.println("Missing Element in Array is : " + i);
			break;
		}
	}
	}
}
