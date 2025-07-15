package assignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String str="ABCD";
		System.out.println("Before Reverse: "+str);
		String rev="";
		int len=str.length();//4
		
		for(int i=len-1;i>=0;i--)//3 2 1 0
		{
			rev=rev+str.charAt(i);//DCBA
		}
		
		System.out.println("Reversed String is:" +rev);

	}

}
