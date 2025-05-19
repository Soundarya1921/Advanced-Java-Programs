//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index

package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemoveByIndex {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Input: which element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the element to remove: ");
        int index = scanner.nextInt();

        // Remove the element at the specified index
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed element '" + removedColor + "' at index " + index);
        } else {
            System.out.println("Invalid index! No element removed.");
        }

        // Display the updated list
        System.out.println("Updated color list: " + colors);
    }
}

