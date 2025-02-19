//Add Two Binary Strings

import java.util.Scanner;
import java.math.BigInteger; // Import BigInteger for binary operations

public class AddBinaryStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first binary string: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary string: ");
        String binary2 = scanner.nextLine();

        
        BigInteger num1 = new BigInteger(binary1, 2);
        BigInteger num2 = new BigInteger(binary2, 2);

        
        BigInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum.toString(2));

        scanner.close();
    }
}
 
