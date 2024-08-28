package assignment.practical6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

class UserMainCode4 {
    public static String calculateBornDay(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        try {
            Date birthDate = sdf.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            
            // Convert to upper case day name
            String dayName = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(birthDate).toUpperCase();
            return dayName;
        } catch (ParseException e) {
            return "Invalid date format. Please use dd-MM-yyyy.";
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your date of birth (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        
        String result = UserMainCode4.calculateBornDay(inputDate);
        System.out.println("You were born on: " + result);
        
        scanner.close();
    }
}

