package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range=s.nextInt();
		int first=0, second=1;
		for(int i=1;i<=range;i++)
		{
			System.out.println(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
		

	}

}
