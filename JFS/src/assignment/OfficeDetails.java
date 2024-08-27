package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class OfficeDetails {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Alice", 30);
        employeeMap.put("Bob", 45);
        employeeMap.put("Charlie", 25);
        employeeMap.put("David", 35);
        employeeMap.put("Eve", 40);
        List<Integer> agesList = new ArrayList<>(employeeMap.values());
        Collections.sort(agesList, Collections.reverseOrder());
        System.out.println("Ages sorted in descending order: " + agesList);
    }
}
