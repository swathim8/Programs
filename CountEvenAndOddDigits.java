package assignment;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		//int num=1234753;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Odd Count: "+odd_count);
		System.out.println("Even Count: "+even_count);
		sc.close();

	}

}
