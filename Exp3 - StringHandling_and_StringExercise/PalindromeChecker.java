//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():

package stringex;
import java.util.Scanner;

public class PalindromeChecker {

    // User-defined function to check palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original cleaned string with its reversed version
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check and display result
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring case and punctuation).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}

