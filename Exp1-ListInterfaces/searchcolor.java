//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not

package arraylist;
import java.util.ArrayList;
public class searchcolor {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        // Display all colors
        System.out.println("Colors in the list: " + colors);

        // Searching for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}

