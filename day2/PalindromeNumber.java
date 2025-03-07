package week1.day2;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=myObj.nextInt();
		int input, output,reverse=0;
		input=n;
		while(input!=0)
		{
			 output=input%10;
			 reverse=reverse*10+output;
			 input/=10;
		}
		
		if(n==reverse)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
		
		
		
		
	}

}
