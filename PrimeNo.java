// Java program to find all the prime numbers from 1 to N

import java.util.Scanner;
public class PrimeNo {

    static void prime_N(int N)
    {
        int x, y, prime;
	
	System.out.println("All the Prime numbers within 1 and " + N + " are:");
            
        for (x = 2; x <= N; x++) {

            
            prime = 1;

            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    prime = 0;
                    break;
                }
            }

            
            if (prime == 1)
                System.out.print(x + " ");
        }
    }

    
    public static void main(String[] args)
    {
        int N;
	Scanner s = new Scanner(System.in);
	System.out.println("\nEnter the extent N of prime number you want to print :\n");
	N = s.nextInt();

        prime_N(N);
    }
}
