//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList

package arraylist;
import java.util.ArrayList;

public class ColorRemove {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed the 2nd element (" + removedElement + "): " + colors);
        } else {
            System.out.println("List has less than 2 elements, cannot remove 2nd element.");
        }

        // Remove the color "Blue"
        if (colors.remove("Blue")) {
            System.out.println("Removed color 'Blue': " + colors);
        } else {
            System.out.println("Color 'Blue' not found in the list.");
        }
    }
}

