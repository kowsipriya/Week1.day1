package Week1.day2;

public class CharTypes {
	public static void main(String[] args) {
		String test = "@#Welcome12 to Selenium World &$@ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;
		char Str[] = test.toCharArray();
		for (int i = 0; i < Str.length; i++) {
			if (Character.isLetter(Str[i])) {
				letter++;
			} else if (Character.isDigit(Str[i])) {
				num++;
			} else if (Character.isSpaceChar(Str[i])) {
				space++;
			} else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
