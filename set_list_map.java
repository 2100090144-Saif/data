import java.util.*;

public class set_list_map {
    public static void main(String[] args) {
        // Creating a HashSet for a set
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        
        // Creating an ArrayList for a list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        // Creating a HashMap for a map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Printing the elements of the set
        System.out.println("Set Elements:");
        for (String element : set) {
            System.out.println(element);
        }
        
        // Printing the elements of the list
        System.out.println("\nList Elements:");
        for (Integer element : list) {
            System.out.println(element);
        }
        
        // Printing the elements of the map
        System.out.println("\nMap Elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
