package assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        
        sc.close();
    }
    
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Other even numbers are not prime
        }
        
        // Check odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        
        return true; // No divisors found, it's prime
    }
}