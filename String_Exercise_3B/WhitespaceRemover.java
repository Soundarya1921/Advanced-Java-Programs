//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()

package stringex;
import java.util.Scanner;

public class WhitespaceRemover {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");  // "\\s+" matches all types of whitespace
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string with whitespaces: ");
        String input = scanner.nextLine();

        // Call the function and display result
        String result = removeWhitespace(input);
        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
    }
}
