import java.io.*;

import java.util.Scanner;
public class LeftTrianglePattern 
{ 
	
	public static void printRow(int n, int totalRows)
	{
		if(totalRows == 0)
		{
			return;
		}
		
		if(totalRows <= n) 
		{
			System.out.print(" *");
		}
		else 
		{
			System.out.print(" ");
		}
		printRow(n, totalRows - 1); 
	}
	
	
	public static void newRow(int n, int totalRows)
	{
		if(n == 0)
		{
			return;
		}
	
		newRow(n - 1, totalRows); 
		printRow(n, totalRows); 
		System.out.print("\n"); 
	}
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter column number : ");
		int col = scanner.nextInt();
		System.out.println("Enter row number : ");
		int row = scanner.nextInt();
		LeftTrianglePattern.newRow(row, col); 
		
		scanner.close();
	}
}
