
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add: " + list);

  
        list.add(1, "JavaScript");
        System.out.println("After add at index: " + list);

    
        System.out.println("Element at index 2: " + list.get(2));


        list.set(0, "Core Java");
        System.out.println("After update: " + list);

  
        System.out.println("Contains Python? " + list.contains("Python"));

       
        System.out.println("Index of C++: " + list.indexOf("C++"));

   
        list.remove("Python");
        System.out.println("After remove Python: " + list);

      
        list.remove(1);
        System.out.println("After remove index 1: " + list);

      
        System.out.println("Size: " + list.size());

     
        System.out.print("Traversing: ");
        for (String lang : list) {
            System.out.print(lang + " ");
        }
        System.out.println();

       
        Collections.sort(list);
        System.out.println("After sorting: " + list);

 
        list.clear();
        System.out.println("After clear: " + list);

        
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
