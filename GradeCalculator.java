import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

       
        System.out.print("Enter the marks obtained (out of 100): ");
        double marks = scanner.nextDouble();

        
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 75 && marks < 90) {
            grade = 'B';
        } else if (marks >= 60 && marks < 75) {
            grade = 'C';
        } else if (marks >= 40 && marks < 60) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }

        
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + marks + "/100");
        System.out.println("Percentage: " + marks + "%");
        
        if (grade == 'F') {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
