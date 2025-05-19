//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

package linkedlist;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> l_list = new LinkedList<>();

        // Add some colors to the LinkedList
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Yellow");
        l_list.add("Purple");

        // Display original list
        System.out.println("Original LinkedList: " + l_list);

        // Swap first (index 0) and third (index 2) elements
        Collections.swap(l_list, 0, 2);

        // Display list after swap
        System.out.println("LinkedList after swapping first and third elements: " + l_list);
    }
}

