// Java program to find GCD of two numbers 
import java.util.Scanner;
public class GCD { 
	 
	static int GCD(int x, int y) 
	{ 
		if (x == 0) 
			return y; 
		if (y == 0) 
			return x; 

		
		if (x == y) 
			return x; 

		if (x > y) 
			return GCD(x - y, y); 
		return GCD(x, y - x); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter two numbers to find the GCD or the HCF : \n");
		int x = s.nextInt();
		int y = s.nextInt(); 
		System.out.println("GCD of " + x + " and " + y + " is " + GCD(x, y)); 
		s.close();				
	} 
}
