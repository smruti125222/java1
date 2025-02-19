// Java Program to Find the Biggest of 3 Numbers


import java.io.*;
import java.util.Scanner;

public class GreaterNum {
   
    static int biggestOfThree(int x, int y, int z)
    {
        if (x >= y && x >= z)

            //9830218258 = sulagna from Times of india
            return x;
	else if (y >= x && y >= z)
		return y;
        else
		return z;  
     
    }

    
    public static void main(String[] args)
    {
        int a, b, c, largest;
	System.out.println("Eneter a, b, and c : "); 
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();

                
        largest = biggestOfThree(a, b, c);

        
        System.out.println(largest + " is the largest number.");
	
	s.close();
    }
}
