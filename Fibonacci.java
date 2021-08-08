package Week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("Firstnumber" + firstNum + "and" + secNum);
		for (int i = 1; i < range; i++) {
			sum = firstNum + secNum;
			System.out.print(" " + sum);
			firstNum = secNum;
			secNum = sum;
		}
	}

}
