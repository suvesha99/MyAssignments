package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="stops";
		String s2="potss";
		if(s1.length()==s2.length())
		{
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			boolean equals = Arrays.equals(s1Array, s2Array);
			if(equals==true)
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
				System.out.println("The given strings are not an Anagram");
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
