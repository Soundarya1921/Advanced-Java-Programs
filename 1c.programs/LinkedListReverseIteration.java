//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Iterate in reverse order using descendingIterator()
        System.out.println("Reverse iteration using descendingIterator():");

        Iterator<String> reverseIterator = colors.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
