// JAVA program to find Armstrong numbers between two integers 
import java.io.*; 
import java.math.*; 
import java.util.Scanner;

public class ArmstrongNum { 
 
	static void ArmstrongNum(int l, int h) 
	{ 
		for (int j = l + 1; j < h; ++j) { 

			int y = j; 
			int N = 0; 
			while (y != 0) { 
				y /= 10; 
				++N; 
			} 
 
			int sum_power = 0; 
			y = j; 
			while (y != 0) { 
				int d = y % 10; 
				sum_power += Math.pow(d, N); 
				y /= 10; 
			} 
 
			if (sum_power == j) 
				System.out.print(j + " "); 
		} 
	} 

	
	public static void main(String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range where you want to find Armstron number : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		ArmstrongNum(n1, n2); 
		System.out.println(); 
	} 
}
