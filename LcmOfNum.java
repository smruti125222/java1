// Java Program to find the LCM of two numbers
import java.io.*;
import java.util.Scanner;

public class LcmOfNum {
    
    public static void main(String[] args)
    {
        
        int a, b;
	Scanner s = new Scanner(System.in);
	System.out.println("\nEnter any two numbers : ");
	a = s.nextInt();
	b = s.nextInt();
	
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
	s.close();

        
        System.out.println("LCM of " + a + " and " + b + " is : " + ans);
                           
    }
}
