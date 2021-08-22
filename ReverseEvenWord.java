package Week1.day2;

public class ReverseEvenWord {
	public static void main(String[] args) {
		String test = "Happy Testleaf Learning";
		String Str[]=test.split(" ");
		for (int i = 0; i < Str.length; i++) {
			if(i%2!=0)
			{
				char test2[] = Str[i].toCharArray();
				String rev = "";
				for (int j = test2.length - 1; j >= 0; j--) {
					rev=rev+test2[j];
				}
				System.out.println(rev);
			}
			else
			{
				System.out.println(Str[i]);
			}
		}
	}
}
