package sets;

import java.util.Comparator;

public class MyComparatorWithSal implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		double sa1= o1.getSal();
		double sa2 = o2.getSal();
		
		if(sa1 <sa2) {
			return 1;
		}else if(sa1>sa2) {
			return -1;
		}else {
			return 0;
		}
		
	}

	
	}

