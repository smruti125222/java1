import java.util.Scanner;
public class CompoundInterest {
    
    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        double amount = principal * Math.pow((1 + rate / (n * 100)), n * time);
        return amount - principal; 
    }

    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter Principal Amount: ");
        double principal = s.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = s.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = s.nextDouble();
        
        System.out.print("Enter Number of Times Interest is Compounded Per Year: ");
        int n = s.nextInt();
        
        double interest = calculateCompoundInterest(principal, rate, time, n);
        System.out.println("Compound Interest: " + interest);
    }
}
