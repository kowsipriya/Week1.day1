package Week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		int num = 16;
		int temp;
		int remainder;
		int result = 0;
		int n = 0;
		temp = num;

		while (temp != 0) {
			temp /= 10;
			++n;
		}
		temp = num;

		while (temp != 0) {
			remainder = temp;
			result += Math.pow(remainder, n);
			temp /= 10;
		}
		System.out.println("-->" + result);
		if (result == num) {
			System.out.print(num + " " + "Is a ArmStrong number");
		} else {
			System.out.print(num + " " + "Is not a ArmStrong number");
		}
	}

}
