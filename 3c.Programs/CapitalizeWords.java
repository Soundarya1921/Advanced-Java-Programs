//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()

package stringex3c;
import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) return input;

        String[] words = input.trim().split("\\s+"); // Split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))  // Capitalize first letter
                      .append(word.substring(1).toLowerCase())       // Lowercase the rest
                      .append(" ");
            }
        }

        return result.toString().trim();  // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Capitalize and display
        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized: " + capitalized);

        scanner.close();
    }
}

