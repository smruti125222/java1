import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        // Check if the number is a Neon number
        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }

        // Close the scanner
        s.close();
    }

    // Function to check if a number is a Neon number
    public static boolean isNeon(int num) {
        // Calculate the square of the number
        int square = num * num;

        // Calculate the sum of digits of the square
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;  // Add the last digit
            square = square / 10;  // Remove the last digit
        }

        // Check if the sum of digits is equal to the original number
        return sumOfDigits == num;
    }
}
