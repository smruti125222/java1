// Java Program to Check if Given Integer is Odd or Even

import java.io.*;
import java.util.Scanner;
 
public class OddEven {
 
   
    public static void main(String[] args)
    {
  	int num ;
	System.out.println("Enter the Number");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
 
        // Checking if number is even or odd number
        // via remainder
        if (num % 2 == 0) {
 
            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even : " + num);
        }
 
        else {
 
            // If remainder is not zero then this number is
            // odd
            System.out.println("Entered Number is Odd : " + num);
        }
    }
}