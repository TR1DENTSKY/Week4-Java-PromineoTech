import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> employeeNames = new ArrayList<String>();

        HashSet<Integer> ids = new HashSet<Integer>();

        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        // Adding 5 elements to employeeNames in ArrayList
        employeeNames.add("Bob");
        employeeNames.add("Mike");
        employeeNames.add("John");
        employeeNames.add("Bill");
        employeeNames.add("Ryan");

        // Adding 5 elements to ids in HashSet
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);

        int i = 0;

        // Enhanced For Loop iterating over ids and using map.put tp add new entry to map
        for (Integer id : ids) {
            employeeMap.put(id, employeeNames.get(i));
            i ++ ;
        }

        // Enhanced For Loop iterating over map.keyset and print both current key and associated value
        for (Integer key : employeeMap.keySet()) {
            System.out.println("Employee " + key + " is " + employeeMap.get(key));
        }

        StringBuilder idsBuilder = new StringBuilder();

        // Enhanced For Loop iterating over ids and append each id with a "-"
        for (Integer id : ids) {
            idsBuilder.append(id + "-");
        }

        idsBuilder.setLength(9); // Setting array length to 9 to remove extra "-" after 5

        System.out.println(idsBuilder.toString());

        StringBuilder namesBuilder = new StringBuilder();

        // Enhanced For Loop iterating over employeeNames Array:ist and append each name follow by " "
        for (String name : employeeNames) {
            namesBuilder.append(name + " ");
        }

        System.out.println(namesBuilder.toString());

    } // Main
} // Class
