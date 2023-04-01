package week1.day1;

public class Fibbinocci {
public static void main(String[] args) {
	int firstNum=0;
	int secNum=1;
	int sum=0;
	System.out.print(firstNum+" "+secNum+" ");
	for (int i=2; i<13; i++)
	{
		sum=firstNum+secNum;
		firstNum=secNum;
	    secNum=sum;
	    System.out.print(sum+" ");
	}
}
}
