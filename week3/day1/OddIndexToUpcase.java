package week3.day1;

public class OddIndexToUpcase {

	public static void main(String[] args) {
		String text="changeme";
		String changedText = "";
		char[] textArray = text.toCharArray();
		for (int i = 0; i < textArray.length; i++) {
			if(i%2 != 0)
			{
				char d = Character.toUpperCase(textArray[i]);
				changedText+=d;			
			}
			else
			{
				char e = textArray[i];
				changedText+=e;
			}
		}
		System.out.println(changedText);

	}

}
