package assignment;

import java.util.Scanner;

public class LargestAndSmallestOf3Func {

    // Method to find the largest of three numbers
    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static int findSmallest(int a,int b, int c)
    {
    	if(a<b && a<c)
    	{
    		return a;
    	}else if(b<a && b<c) {
    		return b;
    	}
    	else
    		return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Get and display largest number
        int largest = findLargest(a, b, c);
        System.out.println("Largest is: " + largest);
        
        int smallest=findSmallest(a,b,c);
        System.out.println("Smallest is: "+smallest);
        sc.close();
    }
    
}
