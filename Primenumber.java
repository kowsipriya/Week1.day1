package Week1.day1;

public class Primenumber {

	/*
	 * To learn about set flag
	 * 
	 */

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag = !flag) {
			System.out.println("The given number " + input + " is a Prime number");
		} else {
			System.out.println("The given number " + input + " is a not a Prime number");
		}

	}

}
