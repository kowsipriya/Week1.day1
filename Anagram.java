package Week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length())

		{
			char Str3[] = text1.toCharArray();
			char Str4[] = text2.toCharArray();
			Arrays.sort(Str3);
			Arrays.sort(Str4);
			System.out.println(Str3);
			System.out.println(Str4);
			if (Arrays.equals(Str3, Str4)) {
				System.out.println("The String is an anagram");
			} else {
				System.out.println("The String is not an anagram");
			}

		}
	}

}
