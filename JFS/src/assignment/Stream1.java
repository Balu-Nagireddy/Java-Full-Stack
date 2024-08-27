package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(20);
		al.add(10);
		al.add(10);
		al.add(30);
		al.add(25);
		
		System.out.println("No of Elements is : "+al.size());
		System.out.println("Java8 forEach() Method : ");
		al.forEach(e->System.out.println(e));
		System.out.println(" Java8 forEach() Method using methodReference Technique : ");
		al.forEach(System.out::println);
		
		//Convert Collection object into Stream object using stream()
		
		Long ct = al.stream().filter(i-> i%2==0).count();
		System.out.println("Even Numbers Count in the List is : "+ct);
		
		//forEach object in al add +3 and convert into new list using map
		
		List<Integer> lt1 = al.stream().map(i-> i+3).collect(Collectors.toList());
		System.out.println("Displaying the map() output : ");
		lt1.forEach(System.out::println);
		
		System.out.println("Natural Sorting order - Ascending order : ");
		al.stream().sorted().forEach(System.out::println);
		
		System.out.println("Descending Order : ");
		Comparator<Integer> cpt = (i1,i2)->(i1>i2?-1:i1<i2?1:0);
		al.stream().sorted(cpt).forEach(System.out::println);
		
		System.out.print("Displaying the Maximum Number of the List : ");
		Comparator<Integer> cpt1 = (i1,i2)->(i1>i2?1:i1<i2?-1:0);
		Integer maxVal = al.stream().max(cpt1).get();
		System.out.println(maxVal);
		
		System.out.print("Displaying the Minimum Number of the List : ");
		Integer minVal = al.stream().min(cpt1).get();
		System.out.println(minVal);
		
	}
}
