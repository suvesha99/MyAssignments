package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int num=7, flag = 0;
		int half=num/2;
		System.out.println(half);
		if (num==0 || num ==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(int i =2; i<=half; i++)
			{
				if (num%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
			if (flag==0)
			{
				System.out.println("Prime number");
			}
		}
		
	}
	

}

