import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        
        long factorial = 1; 
        
       
        if (num < 0) {
            System.out.println("Error! Factorial is not defined for negative numbers.");
        } else {
            
            for (int i = 1; i <= num; i++) {
                factorial *= i; 
            }
            
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        
        
        scanner.close();
    }
}
