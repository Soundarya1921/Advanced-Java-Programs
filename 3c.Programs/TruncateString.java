//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()

package stringex3c;
import java.util.Scanner;

public class TruncateString {

    // User-defined function to truncate string with ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength < 0) return "";

        // If the string is already short enough, return as-is
        if (str.length() <= maxLength) {
            return str;
        }

        // If maxLength is less than or equal to 3, just return dots
        if (maxLength <= 3) {
            return "...".substring(0, maxLength);
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();

        // Truncate and display
        String truncated = truncate(input, maxLength);
        System.out.println("Truncated string: " + truncated);

        scanner.close();
    }
}
