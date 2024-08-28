package assignment.practical6;

import java.util.*;

class UserMainCode2 {
    public static int getLowest(HashMap<Integer, Integer> marks) {
        List<Integer> markList = new ArrayList<>(marks.values());
        Collections.sort(markList);
        
        int sum = 0;
        for (int i = 0; i < 3 && i < markList.size(); i++) {
            sum += markList.get(i);
        }
        return sum;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the HashMap: ");
        int size = scanner.nextInt();
        HashMap<Integer, Integer> marks = new HashMap<>();
        
        System.out.println("Enter marks and roll numbers (rollno marks):");
        for (int i = 0; i < size; i++) {
            int rollno = scanner.nextInt();
            int mark = scanner.nextInt();
            marks.put(rollno, mark);
        }
        
        int result = UserMainCode2.getLowest(marks);
        System.out.println("The sum of the lowest three subject marks is: " + result);
        
        scanner.close();
    }
}

