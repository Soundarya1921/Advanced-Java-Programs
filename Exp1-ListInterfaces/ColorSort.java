//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)

package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
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

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted color list: " + colors);
    }
}

