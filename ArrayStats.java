import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integers:");
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        
       
        for (int i = 0; i < 10; i++) {
            int current = numbers[i];
            
           
            sum += current;
            
            
            if (current > largest) {
                largest = current;
            }
            
            
            if (current < smallest) {
                smallest = current;
            }
            
            
            if (current % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        
        double average = (double) sum / 10;
        
        
        System.out.println("\n--- Results ---");
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average element: " + average);
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
        
        
        scanner.close();
    }
}


