import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms you want: ");
        int count = s.nextInt();

        System.out.println("Fibonacci sequence up to " + count + " terms:");
        printFibonacci(count);
        scanner.close();
    }

    // Fun to print Fibonacci sequence up to 'n' terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        
        // Printing the first two Fibonacci numbers
        System.out.print(first + " " + second + " ");

        // Loop to calculate and print the next terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
