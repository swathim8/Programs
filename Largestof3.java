package assignment;

import java.util.Scanner;

public class Largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("largest number: "+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("largest number: "+b);
		}
		else
			System.out.println("largest number: "+c);
		sc.close();
		}

	}


