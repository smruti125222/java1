import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
  
        System.out.print("Enter Principal Amount: ");
        double principal = s.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = s.nextDouble();
        
        System.out.print("Enter Time (years): ");
        double time = s.nextDouble();
        
        double interest = (principal * rate * time) / 100;
        
        
        System.out.println("Simple Interest: " + interest);
        
        s.close();
    }
}
