import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display original list
        System.out.println("Original ArrayList:");
        System.out.println(fruits);

        // Removing element
        fruits.remove("Orange");

        System.out.println("After removing an element:");
        System.out.println(fruits);

        // Sorting elements
        Collections.sort(fruits);

        System.out.println("After sorting:");
        System.out.println(fruits);

        // Using toArray() method
        Object[] arr = fruits.toArray();

        System.out.println("Array elements using toArray():");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
