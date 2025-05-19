//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

package arraylist;
import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
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

        // Extract the 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
        if (colors.size() >= 2) {
            List<String> subList = colors.subList(0, 2);
            System.out.println("Extracted 1st and 2nd elements: " + subList);
        } else {
            System.out.println("List doesn't contain enough elements to extract.");
        }
    }
}

