package assignment;

public class CountSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		
		int sum=0;
		
		while(num>0)
		{
			
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum of the digits is: "+sum);
	}

}
