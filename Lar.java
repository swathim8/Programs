package assignment;

import java.util.Scanner;

public class Lar {
	public static int larfun(int a,int b, int c)
	{
		if(a>=b && a>=c)
		{
			return a;}
		else if(b>=a && b>=c) {
			return b;}
		else
			return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int larnum=larfun(a,b,c);
		System.out.println("The largest number is:"+larnum);
		sc.close();
	}

}
