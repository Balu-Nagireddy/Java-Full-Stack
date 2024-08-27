package assignment;
import java.util.TreeMap;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        Student student1 = new Student(101, "Alice", 85.5);
        Student student2 = new Student(102, "Bob", 90.0);
        Student student3 = new Student(103, "Charlie", 78.0);
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

