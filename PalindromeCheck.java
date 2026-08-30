import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
       
        String reversed = new StringBuilder(original).reverse().toString();
        
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        
       
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string IS NOT a palindrome.");
        }
        
        scanner.close();
    }
}



