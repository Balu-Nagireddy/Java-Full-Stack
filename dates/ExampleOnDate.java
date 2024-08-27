package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ExampleOnDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		//java8 joda.api org java.time
		LocalDate ld = LocalDate.now();
		System.out.println("Current Date : "+ld);
		System.out.println("Day is Extracted from Date : "+ld.getDayOfMonth());
		System.out.println("Month is Extracted from Date : "+ld.getMonthValue());
		System.out.println("Year is Extracted from Date : "+ld.getYear());
		
		//java8 joda.api org -> java.time
		
		LocalTime lt = LocalTime.now();
		System.out.println("Current Time is : "+lt);
		System.out.println("Hours from Time : "+lt.getHour());
		System.out.println("Minutes from Time : "+lt.getMinute());
		System.out.println("Seconds from Time : "+lt.getSecond());
		System.out.println("Milli Seconds from Time : "+lt.getNano());
		
		//java8 joda.api org -> java.time using LocalDateTime
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Current Date and Time : "+ldt);
		System.out.print("Today Date : ");
		System.out.println(ldt.getDayOfMonth()+"/"+ldt.getMonth()+"/"+ldt.getYear());
		System.out.print("Time Now : ");
		System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
		

	}

}
