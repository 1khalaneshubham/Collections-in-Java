# Java Collections Framework

The **Java Collections Framework** provides a comprehensive architecture for managing and storing groups of objects. It includes several classes and interfaces that simplify operations like searching, sorting, inserting, updating, and deleting elements efficiently.

## Key Features
- **Data Structures:** Lists, Sets, Maps, Queues, and more.
- **Operations:** Searching, sorting, inserting, updating, and iteration.
- **Efficiency:** Improves performance with reusable algorithms and dynamic resizing.

## Common Interfaces
- **List:** Ordered collection, allows duplicates (e.g., `ArrayList`, `LinkedList`).
- **Set:** Unordered collection, no duplicates (e.g., `HashSet`, `TreeSet`).
- **Map:** Key-value pairs, no duplicate keys (e.g., `HashMap`, `TreeMap`).
- **Queue:** FIFO data structure (e.g., `PriorityQueue`, `LinkedList`).

## Example Code

```java
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);  // Duplicate, won't be added

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Output the collections
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}
