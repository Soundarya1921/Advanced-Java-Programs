//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))

package linkedlist;
import java.util.LinkedList;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> l_list = new LinkedList<>();

        // Add initial elements
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");

        // Display list before insertion
        System.out.println("Original color list: " + l_list);

        // Insert "Pink" at the end using offerLast()
        l_list.offerLast("Pink");

        // Display list after insertion
        System.out.println("After inserting 'Pink' at the end: " + l_list);
    }
}

