package Week1.day2;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		String text = "HappyLearning";

		char Name[] = text.toCharArray();
		for (int i = 0; i < Name.length; i++) {
			if (i % 2 != 0) {
				Name[i] = Character.toUpperCase(Name[i]);
			}
		}
		System.out.println(new String(Name));
	}

}