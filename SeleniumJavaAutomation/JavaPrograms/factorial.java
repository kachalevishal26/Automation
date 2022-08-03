package JavaPrograms;

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) {

		int fact=1;
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		for(int i=1; i<=number; i++)
		{
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
