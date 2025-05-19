//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()

package stringex3c;
import java.util.Scanner;

public class NumericCheck {

    // User-defined function to check if string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;

        return str.matches("\\d+");  // Regular expression to match only digits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check and display result
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}

