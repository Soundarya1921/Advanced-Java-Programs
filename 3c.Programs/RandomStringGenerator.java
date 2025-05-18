//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()

package stringex3c;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate a random string
    public static String generateRandomString(int length) {
        if (length <= 0) return "";

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: desired length of the string
        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        // Generate and display random string
        String randomStr = generateRandomString(length);
        System.out.println("Generated Random String: " + randomStr);

        scanner.close();
    }
}

