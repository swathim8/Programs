package assignment;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is: "+rev);
		sc.close();
		
		/*Using String Builder
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
	
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev= sbl.reverse();
		System.out.println("Reverse Number is: "+rev);
	*/
	}

}
