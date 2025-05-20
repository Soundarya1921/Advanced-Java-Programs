//1a . Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as
//follows 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package listprogram;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initializing ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        List<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

        System.out.println("=== ArrayList Operations ===");
        performOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Grapes");
        System.out.println("After adding 'Grapes': " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Papaya");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Kiwi");
        System.out.println("After updating index 2 to 'Kiwi': " + list);

        // 6. Removing elements
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // 7. Searching elements
        boolean containsMango = list.contains("Mango");
        System.out.println("List contains 'Mango': " + containsMango);

        // 8. List size
        System.out.println("List size: " + list.size());

        // 9. Iterating over list
        System.out.print("Iterating using for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 12. Sublist
        List<String> subList = list.subList(1, Math.min(4, list.size())); // Safe bound
        System.out.println("Sublist (index 1 to 3): " + subList);

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}

