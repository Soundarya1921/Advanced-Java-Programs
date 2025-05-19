//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the full list
        System.out.println("Complete color list: " + colors);

        // Iterate starting from the 2nd element (index 1)
        System.out.println("Iterating from 2nd element (index 1):");

        ListIterator<String> iterator = colors.listIterator(1); // Start from index 1

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

