//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()

package stringex;
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all non-overlapping occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the current match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();

        // Count and display occurrences
        int result = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + result + " times in the main string.");

        scanner.close();
    }
}

