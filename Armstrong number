import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            result += digit * digit * digit;  // Add the cube of the digit
            num /= 10;  // Remove the last digit
        }

        return result == originalNumber;  // Compare the result with the original number
    }
}
