// java program to check whether input character is a vowel or consonant 

import java.io.*; 
import java.util.Scanner;

public class ConsonantVowel { 
 
	static void Vowel_Or_Consonant(char y) 
	{ 
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
			|| y == 'u') 
			System.out.println("It is a Vowel."); 
		else
			System.out.println("It is a Consonant."); 
	} 
 
	static public void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		char a = s.next().charAt(0); 
		Vowel_Or_Consonant(a);
	} 
}
