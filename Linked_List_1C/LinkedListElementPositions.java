//4. Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )

package linkedlist;
import java.util.LinkedList;

public class LinkedListElementPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> l_list = new LinkedList<>();

        // Add some colors to the LinkedList
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Yellow");
        l_list.add("Purple");

        // Display elements with their positions
        System.out.println("Elements and their positions:");
        for (int i = 0; i < l_list.size(); i++) {
            System.out.println("Position " + i + ": " + l_list.get(i));
        }
    }
}

