package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=12345;
		int reverse=0, rem, temp;
		temp=input;
		while(temp!=0)
		{
			rem=temp%10; 
			reverse=reverse*10+rem;
			temp/=10;
		}
		if(input==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		

	}

}
