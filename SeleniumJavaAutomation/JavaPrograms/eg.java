package JavaPrograms;

import java.util.Scanner;

public class eg 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = s.nextInt();
		double sum = 0;
		int temp=no,r;
		while(temp>0)
		{
			r = temp%10;
			sum = sum+Math.pow(r, 3);
			temp = temp/10;
		}
		if(sum == no)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
