package Week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int aa;
		int fact = 1;
		int num = 5;
		for (aa = 1; aa < num; aa++) {
			fact = fact * aa;
		}
		System.out.println("Factorial of " + num + " is :" + fact);

	}

}
