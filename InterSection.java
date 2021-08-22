package Week1.day2;

public class InterSection {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 11, 4, 6, 7 };
		int arr1[] = { 1, 0, 5, 4, 9, 7 };
		for (int i = arr[0]; i < arr.length; i++) {
			for (int j = arr1[0]; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
