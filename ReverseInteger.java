public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        // Loop runs until all digits are extracted
        while (number != 0) {
            int lastDigit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Append it to the result
            number = number / 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
