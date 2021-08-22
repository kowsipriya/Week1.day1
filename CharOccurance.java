package Week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
			String str_Text = "WelCome To TestLeaf";
			int count = 0 ;
			char str_Text1[]= str_Text.toCharArray();
			int length=str_Text1.length;
			for (int i = 0; i < length; i++) {
				if(str_Text1[i]=='T')
				{
					count++;
				}
			}
			System.out.println("Total count of T : " + count);
		}
}
